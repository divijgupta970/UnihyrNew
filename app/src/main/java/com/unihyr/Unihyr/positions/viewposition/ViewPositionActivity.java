package com.unihyr.Unihyr.positions.viewposition;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;
import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;

public class ViewPositionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_position);

        MaterialToolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        Position position=intent.getParcelableExtra("position");
        if (position!=null){
            getSupportActionBar().setTitle(position.getTitle());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_position,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.action_moreinfo){
            //TODO: Add more info code here
        }
        else if(item.getItemId()==R.id.action_edit){
            //TODO: Add edit code here
        }
        return super.onOptionsItemSelected(item);
    }
}
