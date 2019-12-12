package com.unihyr.Unihyr.positions;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.adapters.PositionsAdapter;
import com.unihyr.Unihyr.positions.model.Position;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PositionsFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Position> positionList=new ArrayList<>();
    private ProgressBar progressBar;
    private PositionsFragmentViewmodel viewmodel;
    private TextView tvError;
    private MaterialSearchView searchView;
    private PositionsAdapter adapter;
    public PositionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewmodel= ViewModelProviders.of(this).get(PositionsFragmentViewmodel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_positions, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvError=view.findViewById(R.id.tvError);

        progressBar=view.findViewById(R.id.progressbar);
        progressBar.setVisibility(View.VISIBLE);

        final FloatingActionButton fab=view.findViewById(R.id.fab);

        recyclerView=view.findViewById(R.id.rvPositions);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if(dy>0){
                    fab.hide();
                    return;
                }
                if(dy<0){
                    fab.show();
                }
            }
        });

        searchView=view.findViewById(R.id.search_view_positions);
        MaterialToolbar toolbar = view.findViewById(R.id.search_toolbar_positions);
        toolbar.inflateMenu(R.menu.menu_positions);
        MenuItem item= toolbar.getMenu().findItem(R.id.action_search);
        searchView.setMenuItem(item);
        MenuItem item2 = toolbar.getMenu().findItem(R.id.spinner);
        Spinner spinner = (Spinner) item2.getActionView();
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.positions_spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        getPositions();
    }

    private void getPositions() {
        viewmodel.getPositionList().observe(this, new Observer<List<Position>>() {
            @Override
            public void onChanged(List<Position> positions) {
                positionList=positions;
                if (!positions.isEmpty()) {
                    setUpRecyclerView();
                }
                else
                    errorFunction();
            }
        });
    }

    private void errorFunction() {
        progressBar.setVisibility(View.GONE);
        tvError.setVisibility(View.VISIBLE);
    }

    private void setUpRecyclerView() {
        tvError.setVisibility(View.GONE);
        adapter = new PositionsAdapter(getActivity(), positionList);
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        recyclerView.setAdapter(adapter);
        progressBar.setVisibility(View.GONE);
    }
}
