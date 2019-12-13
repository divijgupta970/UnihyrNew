package com.unihyr.Unihyr.users;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewholder>{

    private Context mCtx;

    public UsersAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public UsersViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_users,parent,false);
        return new UsersViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class UsersViewholder extends RecyclerView.ViewHolder{

        public UsersViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
