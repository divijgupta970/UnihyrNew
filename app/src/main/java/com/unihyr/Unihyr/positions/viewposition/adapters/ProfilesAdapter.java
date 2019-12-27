package com.unihyr.Unihyr.positions.viewposition.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.viewposition.model.ViewPosition;
import com.unihyr.Unihyr.profile_status.ProfileStatusActivity;
import com.unihyr.Unihyr.util.Utils;

import java.util.List;

public class ProfilesAdapter extends RecyclerView.Adapter<ProfilesAdapter.ProfilesViewholder>{
    private Context mCtx;
    private List<ViewPosition> viewPositionList;

    public ProfilesAdapter(Context mCtx,List<ViewPosition> viewPositionList) {
        this.mCtx = mCtx;
        this.viewPositionList=viewPositionList;
    }

    @NonNull
    @Override
    public ProfilesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_active_profiles,parent,false);
        return new ProfilesViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfilesViewholder holder, int position) {
        final ViewPosition viewPosition=viewPositionList.get(position);
        holder.tvName.setText(viewPosition.getName());
        holder.tvSubmit.setText(viewPosition.getSubmittedBy());
        holder.tvContact.setText(viewPosition.getContact());
        holder.ivCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utils.dialNumber(mCtx,viewPosition.getContact());
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mCtx,ProfileStatusActivity.class);
                intent.putExtra("position",viewPosition);
                mCtx.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return viewPositionList.size();
    }

    public class ProfilesViewholder extends RecyclerView.ViewHolder{
        private TextView tvName,tvSubmit,tvContact;
        private ImageView ivCall;

        public ProfilesViewholder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvSubmit=itemView.findViewById(R.id.tvSubmit);
            tvContact=itemView.findViewById(R.id.tvPhone);
            ivCall=itemView.findViewById(R.id.ivCall);

        }
    }
}
