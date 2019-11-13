package com.example.pubgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabLayout;
    Button nextButton;
    int position=0;
    Button getStartButton;
    Animation buttonAnimation;
    public static boolean isIntroActivityOpendBefor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        //make activty full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        //when this activity is about to be launch we need to check if it was opened before or not
        if (restorePrefData())
        {
            Intent mainActivity=new Intent(getApplicationContext(),RegesterActivity.class);
            startActivity(mainActivity);
            finish();
        }

        tabLayout=findViewById(R.id.tab_indecator_id);
        nextButton=findViewById(R.id.nextButtonId);
        getStartButton=findViewById(R.id.getStartButtonId);
        buttonAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        getStartButton.setVisibility(View.GONE);
        //list
        final List<IntroModel> introModelList=new ArrayList<>();
        introModelList.add(new IntroModel("Fresh food","Throughout the docs, we will often use the router instance. Keep in mind that this.$router is exactly the s",R.drawable.img1));
        introModelList.add(new IntroModel("Fresh Firt delivery","Throughout the docs, we will often use the router instance. Keep in mind that this.$router is exactly the s",R.drawable.img1));
        introModelList.add(new IntroModel("Low cost","Throughout the docs, we will often use the router instance. Keep in mind that this.$router is exactly the s",R.drawable.img1));

//        setup viewPager
        screenPager=findViewById(R.id.viewPager);
        introViewPagerAdapter=new IntroViewPagerAdapter(this,introModelList);
        screenPager.setAdapter(introViewPagerAdapter);
        //setup tablayout with viewPager
        tabLayout.setupWithViewPager(screenPager);
        //tablayout add changer listiner
        //TODO: when user scrool item then last item shoe start btn
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==introModelList.size()-1)
                {
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //set next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position=screenPager.getCurrentItem();
                if (position<introModelList.size())
                {
                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position==introModelList.size())//when the intro item last the next button turn into GetStart button
                {
                    //TODO: show the GETSTART Button and hide the indicator and the next button
                    loadLastScreen();
                }
            }
        });

        //set getStrat button click event
        getStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open mainActivity
                Intent intent=new Intent(getApplicationContext(),RegesterActivity.class);
                startActivity(intent);
                //also we need to save a boolean data to storage use sharedPreference
                //when user run the app we could know that he is already checked the screen activity
                //we going to use shared prefrence to that process
                savePrefsData();
                finish();
            }
        });
    }

    public boolean restorePrefData() {

        SharedPreferences pref=getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        isIntroActivityOpendBefor=pref.getBoolean("isIntroOpend",false);
        return  isIntroActivityOpendBefor;

    }

    //we going to use shared prefrence to that process
    //to store data
    private void savePrefsData() {
        SharedPreferences pref=getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putBoolean("isIntroOpend",true);
        editor.commit();
    }

    //show the GETSTART Button and hide the indicator and the next button
    private void loadLastScreen() {
        nextButton.setVisibility(View.INVISIBLE);
        getStartButton.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.VISIBLE);
        //ToDo: add animation
        //create button animation
//        set animatiom
        getStartButton.setAnimation(buttonAnimation);

    }
}
