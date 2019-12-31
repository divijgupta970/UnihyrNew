package com.unihyr.Unihyr.offers_management.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.profile_status.ProfileStatusActivity;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.OfferViewholder>{
    private Context mCtx;

    public OfferAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public OfferViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_offers,parent,false);
        return new OfferViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferViewholder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCtx.startActivity(new Intent(mCtx, ProfileStatusActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class OfferViewholder extends RecyclerView.ViewHolder {

        public OfferViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
