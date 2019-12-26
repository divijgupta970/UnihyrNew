package com.unihyr.Unihyr.drives_management;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.drives_management.adapter.DrivesAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrivesFragment extends Fragment {
    private RecyclerView recyclerView;
    private DrivesAdapter adapter;
    private Spinner spinner;

    public DrivesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drives, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        spinner=view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.drives_spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        adapter=new DrivesAdapter(getActivity());
        recyclerView.setAdapter(adapter);
    }
}


