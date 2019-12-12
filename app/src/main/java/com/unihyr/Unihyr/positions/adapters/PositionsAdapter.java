package com.unihyr.Unihyr.positions.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;

import java.util.List;

public class PositionsAdapter extends RecyclerView.Adapter<PositionsAdapter.PositionsViewholder>{
    private Context mCtx;
    private List<Position> positionList;

    public PositionsAdapter(Context mCtx, List<Position> positionList) {
        this.mCtx = mCtx;
        this.positionList = positionList;
    }

    @NonNull
    @Override
    public PositionsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.card_position,parent,false);
        return new PositionsViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PositionsViewholder holder, int position) {
        Position currentPosition=positionList.get(position);
        holder.tvPosition.setText(currentPosition.getTitle());
        holder.tvLocation.setText(currentPosition.getLocation());
        holder.tvInitiator.setText("null");
    }

    @Override
    public int getItemCount() {
        return positionList.size();
    }

    public class PositionsViewholder extends RecyclerView.ViewHolder{
        private TextView tvPosition,tvLocation,tvInitiator;

        public PositionsViewholder(@NonNull View itemView) {
            super(itemView);
            tvPosition=itemView.findViewById(R.id.tvPosition);
            tvLocation=itemView.findViewById(R.id.tvLocation);
            tvInitiator=itemView.findViewById(R.id.tvInitiator);
        }
    }
}
