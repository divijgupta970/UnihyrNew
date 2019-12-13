package com.unihyr.Unihyr.positions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;

public class PositionDialogFragment extends DialogFragment {
    private Position position;
    private ImageView ivActivate,ivDeactivate,ivEdit,ivApprove;
    public PositionDialogFragment(Position position) {
        this.position=position;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_positions_dialog,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivActivate=view.findViewById(R.id.ivActivate);
        ivDeactivate=view.findViewById(R.id.ivDeactivate);
        ivEdit=view.findViewById(R.id.ivEdit);
        ivApprove=view.findViewById(R.id.ivApprove);

        if (!position.getActive()){
            ivActivate.setVisibility(View.VISIBLE);
            ivDeactivate.setVisibility(View.GONE);
            ivEdit.setVisibility(View.GONE);
        }

    }
}
