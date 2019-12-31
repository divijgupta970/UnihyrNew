package com.unihyr.Unihyr.profile_status;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.unihyr.Unihyr.R;

import java.util.Calendar;

public class ScheduleInterviewActivity extends AppCompatActivity {

    private TextView txtDate;
    private MaterialButton btnDateTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_interview);
        txtDate=findViewById(R.id.tvDateTime);
        MaterialToolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Schedule Interview");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        /*ImageView email=(ImageView)  findViewById(R.id.send_mail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on click to sned mail
                sendEmail();
            }
        });*/
        Spinner rounds = findViewById(R.id.sc_Rounds);
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
        Spinner EvalvationMode = findViewById(R.id.sc_EvaluationModeE);
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
        Spinner Date_time = findViewById(R.id.sc_DateTimeE);
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

        btnDateTime=findViewById(R.id.btnDateTime);
        btnDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateTimePicker();
            }
        });
    }

    private void showDateTimePicker() {
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        txtDate.setVisibility(View.VISIBLE);
                        showTimePicker();
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    private void showTimePicker() {
        final Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {

                        txtDate.append(" "+hourOfDay + ":" + minute);
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }

    private void sendEmail() {
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

}
