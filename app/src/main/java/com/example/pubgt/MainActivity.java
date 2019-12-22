package com.example.pubgt;

import android.app.ActionBar;
import android.os.Bundle;

import com.example.pubgt.ui.home.HomeFragment;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //top app bar
    private BottomAppBar bottomAppBar;
    //top app bar

    //bottom app bar\
    private AppBarConfiguration mAppBarConfiguration;
    //bottom app bar

    //fab icon
    private FloatingActionButton fab;
    //fab icon
    private boolean isFabTapped = false;
    //main frame layout
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tool bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //bottom app bar
        bottomAppBar = findViewById(R.id.bottomAppBar);
        //fab btn
         fab = findViewById(R.id.fab);
         //frame layout
        frameLayout = findViewById(R.id.main_frameLayoutId);


//-------------------------------------------------------------------------------------------
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_ptc, R.id.nav_wc,
                R.id.nav_tournament, R.id.nav_send,R.id.nav_myAccount,R.id.nav_event,R.id.nav_runTournament,R.id.nav_shop)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
//------navigation drawer aprt end----------------------------------------------------------------------------------------

        //bottom nav bar
        handleFab();
        handleOnClickListeners();
//This code snippet adds specified (R.menu.bottom_menu) menu to BottomAppBar
        bottomAppBar.replaceMenu(R.menu.bottom_menu);
        //bottom nav bar

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    //bottom nav bar fragment
    private void handleFrame(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        fragmentTransaction.replace(frameLayout.getId(), fragment);
        fragmentTransaction.commit();
    }
    private void handleFab() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isFabTapped = !isFabTapped;
                if (isFabTapped) {
                    bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
                    handleFrame(new TournamentFragment());
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_arrow_back_black_24dp));
                } else {
                    bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
                    handleFrame(new HomeFragment());
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_videogame_asset_black_24dp));
                }
            }

        });
    }



    private void handleOnClickListeners() {
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.myAccountBottom:
                        handleFrame(new MyAccountFragment());
                        break;

                    case R.id.ptcBottom:
                        handleFrame(new PTCFragment());
                        break;

                    default:
                        return false;
                }
                return false;
            }
        });
    }

}
