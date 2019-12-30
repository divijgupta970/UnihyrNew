package com.unihyr.Unihyr.profile_status;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.unihyr.Unihyr.R;

import java.util.ArrayList;

public class ScheduleInterviewActivity extends AppCompatActivity {
    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {
                "nikhil.nagpal98@gmail.com"
        };
        String[] CC = {
                "karamjitverma89@gmail.com"
        };
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
    // This is just a sample script. Paste your real code (javascript or HTML) here.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_interview);
        ImageView email=(ImageView)  findViewById(R.id.send_mail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on click to sned mail
                sendEmail();
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
