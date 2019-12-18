package com.unihyr.Unihyr.offers_management;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.offers_management.adapter.OfferAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class OfferFragment extends Fragment {
    private RecyclerView recyclerView;
    private OfferAdapter adapter;
    private FloatingActionButton fab;
    public OfferFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_offer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fab=view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new BottomSheetDialog(new BottomSheetDialog.BottomSheetListener() {
                    @Override
                    public void onApply() {

                    }
                }).show(getFragmentManager(),"BottomSHeet");
            }
        });



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

        setUpRecyclerView();

    }


    private void setUpRecyclerView() {
        adapter=new OfferAdapter(getActivity());
        recyclerView.setAdapter(adapter);
    }
}
