package com.unihyr.Unihyr.positions.viewposition;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.model.Position;

public class ViewPositionActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_position);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tabLayoutViewPositions);
        viewPager=findViewById(R.id.viewPagerViewPositions);
        viewPager.setAdapter(new ViewPagerAdapter(this));
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                String text="";
                switch (position){
                    case 0:
                        text="Profiles";
                        break;
                    case 1:
                        text="To do's";
                        break;
                    case 2:
                        text="Team";
                        break;
                    case 3:
                        text="Drives";
                        break;
                }
                tab.setText(text);
            }
        }).attach();

        Intent intent = getIntent();
        Position position = intent.getParcelableExtra("position");
        if (position != null) {
            getSupportActionBar().setTitle(position.getTitle());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_position, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_moreinfo) {
            //TODO: Add more info code here
        } else if (item.getItemId() == R.id.action_edit) {
            //TODO: Add edit code here
        }
        return super.onOptionsItemSelected(item);
    }

    private class ViewPagerAdapter extends FragmentStateAdapter {


        public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            Fragment fragment=null;
            switch (position) {
                case 0:
                    fragment = new ProfilesFragment();
                    break;
                case 1:
                    fragment = new ToDoFragment();
                    break;
                case 2:
                    fragment = new TeamFragment();
                    break;
                case 3:
                    fragment = new DrivesFragment();
                    break;

            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return 4;
        }
    }
}