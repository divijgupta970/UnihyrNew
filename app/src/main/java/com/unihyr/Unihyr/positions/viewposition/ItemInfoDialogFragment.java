package com.unihyr.Unihyr.positions.viewposition;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemInfoDialogFragment extends DialogFragment {

    private TextView tvStatus,tvExp,tvOrg,tvChannel,tvRole;
    public ItemInfoDialogFragment(Position position) {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_info_dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvStatus=view.findViewById(R.id.tvStatus);
        tvExp=view.findViewById(R.id.tvExp);
        tvOrg=view.findViewById(R.id.tvCurrOrg);
        tvChannel=view.findViewById(R.id.tvChannel);
        tvRole=view.findViewById(R.id.tvCurrentRole);
    }
}
