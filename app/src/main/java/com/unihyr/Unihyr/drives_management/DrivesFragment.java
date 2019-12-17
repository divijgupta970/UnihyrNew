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
import com.unihyr.Unihyr.drives_management.drivesAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrivesFragment  extends Fragment {
   // Todo complete driver fragment and spinner array

    public DrivesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drives, container, false);
    }

   }
