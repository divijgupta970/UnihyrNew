package com.unihyr.Unihyr.drives_management;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.adapters.PositionsAdapter;

import java.util.ArrayList;
import java.util.List;

public class drivesAdapter extends RecyclerView.Adapter<drivesAdapter.viewHolder>  {
    private Context mCtx;
    private List<drives> driverList;
    //private InfoClickHandler clickHandler;
    public drivesAdapter(Context mCtx, List<drives> driverList) {
        this.mCtx = mCtx;
        this.driverList = driverList;
        //this.clickHandler=clickHandler;
    }

    public drivesAdapter(FragmentActivity activity) {
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drivers,parent,false);
 return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
drives currentdriver=driverList.get(position);
holder.drcontactperson.setText(currentdriver.getDrcontactperson());
holder.drPostion.setText(currentdriver.getDrpostion());
holder.drLocation.setText(currentdriver.getDrlocation());
holder.drdrive.setText(currentdriver.getDrdrive());
    }

    @Override
    public int getItemCount() {
        return driverList.size();
    }



    public class viewHolder extends RecyclerView.ViewHolder
    {
        private TextView drdrive,drLocation,drPostion,drcontactperson;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            drdrive=itemView.findViewById(R.id.drDrive);
            drLocation=itemView.findViewById(R.id.drLocation);
            drPostion=itemView.findViewById(R.id.drPostion);
            drcontactperson=itemView.findViewById(R.id.drcontactperson);
            itemView.findViewById(R.id.drInfo).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }

}
