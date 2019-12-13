package com.unihyr.Unihyr.positions.viewposition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.util.Utils;

public class PositionInfoDialogFragment extends DialogFragment {

    private Position position;

    PositionInfoDialogFragment(Position position) {
        this.position = position;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dialog_viewposition_info,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvCreated = view.findViewById(R.id.tvChannel);
        TextView tvModified = view.findViewById(R.id.tvStatus);
        TextView tvLocation = view.findViewById(R.id.tvCurrentRole);
        TextView tvOpenings = view.findViewById(R.id.tvCurrOrg);
        TextView tvJobCode = view.findViewById(R.id.tvExp);

        tvCreated.setText(Utils.convertTimetoDate(position.getCreateDate()));
        tvModified.setText(position.getModifyDate()==null?"never":Utils.convertTimetoDate(position.getModifyDate()));
        tvLocation.setText(position.getLocation());
        tvOpenings.setText(Long.toString(position.getNoOfPosts()));
        tvJobCode.setText(position.getJobCode());
    }
}
