package com.unihyr.Unihyr.positions;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
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
    private MaterialButton btnRetry;
    private Spinner spinner;
    private MaterialToolbar toolbar;

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
        btnRetry=view.findViewById(R.id.btnRetry);
        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPositions();
            }
        });

        progressBar=view.findViewById(R.id.progressbar);

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
        toolbar = view.findViewById(R.id.search_toolbar_positions);
        handleSearchView();

        getPositions();
    }

    private void handleSearchView() {
        toolbar.inflateMenu(R.menu.menu_positions);
        MenuItem item= toolbar.getMenu().findItem(R.id.action_search);
        searchView.setMenuItem(item);
        MenuItem item2 = toolbar.getMenu().findItem(R.id.spinner);
        spinner = (Spinner) item2.getActionView();
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.positions_spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void getPositions() {
        progressBar.setVisibility(View.VISIBLE);

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
        btnRetry.setVisibility(View.VISIBLE);
    }

    private void setUpRecyclerView() {
        tvError.setVisibility(View.GONE);
        btnRetry.setVisibility(View.GONE);
        adapter = new PositionsAdapter(getActivity(), positionList, new PositionsAdapter.InfoClickHandler() {
            @Override
            public void onInfoClicked(Position position) {
                showInfoDialog(position);
            }
        });

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

    private void showInfoDialog(Position position) {
        FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
        Fragment prev= getActivity().getSupportFragmentManager().findFragmentByTag("dialog");
        if(prev!=null)
            ft.remove(prev);
        ft.addToBackStack(null);
        PositionDialogFragment newFragment= new PositionDialogFragment(position);
        newFragment.show(ft,"dialog");
    }
}
