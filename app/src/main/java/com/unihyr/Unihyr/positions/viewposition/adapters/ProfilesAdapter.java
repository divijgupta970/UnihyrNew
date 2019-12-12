package com.unihyr.Unihyr.positions.viewposition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;

public class ProfilesAdapter extends RecyclerView.Adapter<ProfilesAdapter.ProfilesViewholder>{
    private Context mCtx;

    public ProfilesAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public ProfilesViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_active_profiles,parent,false);
        return new ProfilesViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfilesViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ProfilesViewholder extends RecyclerView.ViewHolder{

        public ProfilesViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
