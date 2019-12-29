package com.unihyr.Unihyr.profile_status;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.unihyr.Unihyr.R;

import java.util.ArrayList;

public class ScheduleInterviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_interview);
        ImageView email=(ImageView)  findViewById(R.id.send_mail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on click to sned mail
            }
        });
       Spinner rounds = (Spinner) findViewById(R.id.sc_Rounds);
        ArrayAdapter<CharSequence> Roundadapter = ArrayAdapter.createFromResource(this,
               R.array.rounds_spinner_array, android.R.layout.simple_spinner_item);
      Roundadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rounds.setAdapter(Roundadapter);
    rounds.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
        Spinner EvalvationMode = (Spinner) findViewById(R.id.sc_EvaluationModeE);
        ArrayAdapter<CharSequence> Elivationadapter = ArrayAdapter.createFromResource(this,
                R.array.Elivation_spinner_array, android.R.layout.simple_spinner_item);
        Elivationadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        EvalvationMode.setAdapter(Elivationadapter);
    EvalvationMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
        Spinner Date_time = (Spinner) findViewById(R.id.sc_DateTimeE);
        ArrayAdapter<CharSequence> Date_Timeadapter = ArrayAdapter.createFromResource(this,
                R.array.DateTime_spinner_array, android.R.layout.simple_spinner_item);
        Elivationadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Date_time.setAdapter(Date_Timeadapter);
        Date_time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    }

}
