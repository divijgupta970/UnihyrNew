package com.unihyr.Unihyr.profile_status;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.unihyr.Unihyr.R;
import com.unihyr.Unihyr.positions.viewposition.DrivesFragment;
import com.unihyr.Unihyr.positions.viewposition.ProfilesFragment;
import com.unihyr.Unihyr.positions.viewposition.TeamFragment;
import com.unihyr.Unihyr.positions.viewposition.ToDoFragment;
import com.unihyr.Unihyr.positions.viewposition.ViewPositionActivity;

public class ProfileStatusActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_status);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(new ProfileStatusActivity.ViewPagerAdapter(this));
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                String text="";
                int icon=0;
                switch (position){
                    case 0:
                        text="Profile";
                        icon=R.drawable.ic_user;
                        break;
                    case 1:
                        text="History";
                        icon=R.drawable.ic_clock;
                        break;
                    case 2:
                        text="Notes";
                        icon=R.drawable.ic_list;
                        break;
                    case 3:
                        text="Interview Details";
                        icon=R.drawable.ic_briefcase;
                        break;
                }
                tab.setText(text);
                tab.setIcon(icon);
            }
        }).attach();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile_status, menu);
        return true;
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
                    fragment = new ProfileStatusFragment();
                    break;
                case 1:
                    fragment = new HistoryFragment();
                    break;
                case 2:
                    fragment = new NotesFragment();
                    break;
                case 3:
                    fragment = new InterviewDetailsFragment();
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
