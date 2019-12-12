package com.unihyr.Unihyr.positions;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
    private PositionsAdapter adapter;
    private TextView tvError;
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
        adapter=new PositionsAdapter(getActivity(),positionList);
        recyclerView.setAdapter(adapter);
        progressBar.setVisibility(View.GONE);
    }
}
