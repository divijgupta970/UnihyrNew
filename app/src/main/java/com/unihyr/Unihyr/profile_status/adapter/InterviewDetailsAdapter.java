package com.unihyr.Unihyr.profile_status.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unihyr.Unihyr.R;

public class InterviewDetailsAdapter extends RecyclerView.Adapter<InterviewDetailsAdapter.InterviewDetailsViewHolder>{
    private Context mCtx;

    public InterviewDetailsAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public InterviewDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mCtx).inflate(R.layout.item_interview_details,parent,false);
        return new InterviewDetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InterviewDetailsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class InterviewDetailsViewHolder extends RecyclerView.ViewHolder{

        public InterviewDetailsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
