package com.unihyr.Unihyr.positions.viewposition;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.positions.viewposition.adapters.ProfilesAdapter;
import com.unihyr.Unihyr.positions.viewposition.adapters.ToDoAdapter;
import com.unihyr.Unihyr.positions.viewposition.model.ViewPosition;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilesFragment extends Fragment {
    private Spinner spinner;
    private RecyclerView recyclerView;
    private ProfilesAdapter adapter;
    private ViewPositionsViewmodel viewmodel;
    private List<ViewPosition> viewPositionList;
    private Position position;

    public ProfilesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewmodel= ViewModelProviders.of(getActivity()).get(ViewPositionsViewmodel.class);
        position=viewmodel.getPosition();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profiles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spinner=view.findViewById(R.id.spinner);
        recyclerView=view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.profiles_spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        getPositionList();
    }

    private void getPositionList() {
        viewmodel.getViewPositionList(position.getPostId(),"all",0).observe(this, new Observer<List<ViewPosition>>() {
            @Override
            public void onChanged(List<ViewPosition> viewPositions) {
                viewPositionList=viewPositions;
                if (viewPositionList!=null&&!viewPositionList.isEmpty()) {
                    setUpRecyclerView();
                }else {
                    errorFunction();
                }
            }
        });
    }

    private void errorFunction() {
        Log.d("PositionsFragment","Error occured");
    }

    private void setUpRecyclerView() {
        adapter=new ProfilesAdapter(getActivity(),viewPositionList);
        recyclerView.setAdapter(adapter);
    }
}
