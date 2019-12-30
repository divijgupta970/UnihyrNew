package com.unihyr.Unihyr.profile_status;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unihyr.Unihyr.MainActivity;
import com.unihyr.Unihyr.R;

import static com.unihyr.Unihyr.R.*;

public class Interview_Adapter extends RecyclerView.Adapter<Interview_Adapter.interviewPlaceHolder> {
    Context mCtx;
    public  Interview_Adapter(Context mCtx){
        this.mCtx=mCtx;
    }
@NonNull
    @Override
    public interviewPlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(mCtx).inflate(layout.schedule_interview_disp_card, parent, false);
    return new interviewPlaceHolder(view);  }

    @Override
    public void onBindViewHolder(@NonNull interviewPlaceHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class interviewPlaceHolder extends RecyclerView.ViewHolder {
        TextView round,Date,Duration,Email,Mode,Evalution;
        FloatingActionButton sc_fab;
        public interviewPlaceHolder(@NonNull View itemView) {
            super(itemView);
            round =itemView.findViewById(R.id.sc_card_selectroundE);
            Date=itemView.findViewById(R.id.sc_DateTimeE);
            Duration=itemView.findViewById(R.id.sc_DurationE);
            Email=itemView.findViewById(R.id.sc_InterviewerEmailE);
            Mode=itemView.findViewById(R.id.sc_Mode_DetailE);
            Evalution=itemView.findViewById(R.id.sc_EvaluationModeE);
            sc_fab=itemView.findViewById(id.sc_fab);
            sc_fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
              //code to go to activity_schedule_Interview
                }
            });
        }
    }
}
