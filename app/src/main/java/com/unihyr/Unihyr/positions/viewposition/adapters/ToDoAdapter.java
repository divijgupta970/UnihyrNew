package com.unihyr.Unihyr.positions.viewposition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewholder> {
    public ToDoAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    private Context mCtx;
    @NonNull
    @Override
    public ToDoViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_todo,parent,false);
        return new ToDoViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class ToDoViewholder extends RecyclerView.ViewHolder{

        public ToDoViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
