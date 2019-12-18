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

public class DrivesAdapter extends RecyclerView.Adapter<DrivesAdapter.viewHolder> {
    private Context mCtx;
    private List<Drive> driverList;

    //private InfoClickHandler clickHandler;
    public DrivesAdapter(Context mCtx, List<Drive> driverList) {
        this.mCtx = mCtx;
        this.driverList = driverList;
        //this.clickHandler=clickHandler;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.item_drives, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Drive currentdriver = driverList.get(position);
        holder.drcontactperson.setText(currentdriver.getDrcontactperson());
        holder.drPostion.setText(currentdriver.getDrpostion());
        holder.drLocation.setText(currentdriver.getDrlocation());
        holder.drdrive.setText(currentdriver.getDrdrive());
    }

    @Override
    public int getItemCount() {
        return driverList.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        TextView drdrive, drLocation, drPostion, drcontactperson;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            drdrive = itemView.findViewById(R.id.drDrive);
            drLocation = itemView.findViewById(R.id.drLocation);
            drPostion = itemView.findViewById(R.id.drPostion);
            drcontactperson = itemView.findViewById(R.id.drcontactperson);

        }

    }
}
