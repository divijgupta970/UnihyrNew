package com.unihyr.Unihyr.drives_management;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unihyr.Unihyr.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrivesFragment extends Fragment {


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
