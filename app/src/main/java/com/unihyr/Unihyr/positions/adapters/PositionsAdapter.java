package com.unihyr.Unihyr.positions.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.positions.viewposition.ViewPositionActivity;

import java.util.ArrayList;
import java.util.List;

public class PositionsAdapter extends RecyclerView.Adapter<PositionsAdapter.PositionsViewholder> implements Filterable {
    private Context mCtx;
    private List<Position> positionList;
    private List<Position> positionListSearched;
    private InfoClickHandler clickHandler;

    public PositionsAdapter(Context mCtx, List<Position> positionList,InfoClickHandler clickHandler) {
        this.mCtx = mCtx;
        this.positionList = positionList;
        this.positionListSearched= positionList;
        this.clickHandler=clickHandler;
    }

    @NonNull
    @Override
    public PositionsViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_position,parent,false);
        return new PositionsViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PositionsViewholder holder, int position) {
        Position currentPosition=positionListSearched.get(position);
        holder.tvPosition.setText(currentPosition.getTitle());
        holder.tvLocation.setText(currentPosition.getLocation());
        holder.tvPostId.setText(currentPosition.getJobCode());
        holder.tvInitiator.setText("null");
    }

    @Override
    public int getItemCount() {
        return positionListSearched.size();
    }

    public class PositionsViewholder extends RecyclerView.ViewHolder{
        private TextView tvPosition,tvLocation,tvInitiator,tvPostId;

        public PositionsViewholder(@NonNull View itemView) {
            super(itemView);
            tvPosition=itemView.findViewById(R.id.tvName);
            tvLocation=itemView.findViewById(R.id.tvSubmit);
            tvInitiator=itemView.findViewById(R.id.tvPhone);
            tvPostId=itemView.findViewById(R.id.tvPostId);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(mCtx, ViewPositionActivity.class);
                    intent.putExtra("position",positionListSearched.get(getAdapterPosition()));
                    mCtx.startActivity(intent);
                }
            });
            itemView.findViewById(R.id.ivInfo).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickHandler.onInfoClicked(positionList.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface InfoClickHandler{
         void onInfoClicked(Position position);
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String key =constraint.toString();
                if (key.isEmpty())
                {
                    positionListSearched=positionList;
                }
                else
                {
                    ArrayList<Position> lstFiltered = new ArrayList<>();
                    for(Position row:positionList)
                    {
                        if (row.getTitle().toLowerCase().contains(key.toLowerCase())){
                            lstFiltered.add(row);
                        }
                    }
                    positionListSearched= lstFiltered;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values= positionListSearched;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                positionListSearched = (ArrayList<Position>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}
