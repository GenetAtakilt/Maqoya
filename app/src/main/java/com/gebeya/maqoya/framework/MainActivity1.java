package com.gebeya.maqoya.framework;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.gebeya.maqoya.framework.ui.dashboard.DayCareDetial;
import com.gebeya.maqoya.framework.ui.dashboard.ExploreFragment;
import com.gebeya.maqoya.framework.ui.home.HomeFragment;
import com.gebeya.maqoya.framework.ui.notifications.ChildFragment;
import com.gebeya.maqoya.framework.ui.setting.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity1 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    Button home;
   CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(this);
        loadFragment(new ExploreFragment());


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_nearYou, R.id.navigation_explore, R.id.navigation_myChild)
//                .build();

//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupWithNavController(navView, navController);
    }

    private boolean loadFragment(Fragment fragment)
    {
        if(fragment != null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment,fragment)
                    .commit();
            return true;

        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId())
        {
            case R.id.navigation_nearYou:

                fragment = new HomeFragment();
                break;

            case R.id.navigation_explore:
                fragment = new ExploreFragment();
                break;

            case R.id.navigation_myChild:
                fragment = new ChildFragment();
                break;

            case R.id.navigation_setting:
                fragment = new SettingFragment();


        }
        return loadFragment(fragment);
    }
}
