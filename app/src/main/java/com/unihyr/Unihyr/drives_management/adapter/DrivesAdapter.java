package com.unihyr.Unihyr.drives_management.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.drives_management.model.Drive;

import java.util.List;

public class DrivesAdapter extends RecyclerView.Adapter<DrivesAdapter.DrivesViewHolder> {
    private Context mCtx;


    public DrivesAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public DrivesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.item_drives, parent, false);
        return new DrivesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrivesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class DrivesViewHolder extends RecyclerView.ViewHolder {
        TextView drdrive, drLocation, drPostion, drcontactperson;

        public DrivesViewHolder(@NonNull View itemView) {
            super(itemView);
            drdrive = itemView.findViewById(R.id.drDrive);
            drLocation = itemView.findViewById(R.id.drLocation);
            drPostion = itemView.findViewById(R.id.drPostion);
            drcontactperson = itemView.findViewById(R.id.drcontactperson);

        }

    }
}
