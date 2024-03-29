package com.example.pubgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;

public class RegesterActivity extends AppCompatActivity {
    FrameLayout frameLayout;

    public static Boolean setSignUpFragment=false;

    //    for mobuke backbutton
    public static Boolean onResetPasswordFragmnet=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        //make activty full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        frameLayout=findViewById(R.id.RegesterFrameLayoutId);
        if(setSignUpFragment)
        {
            setSignUpFragment=false;
            setFragment(new SignupFragment());
        }else
        {
            setFragment(new SigninFragment());
        }
    }
    //for set fragment in frame layout
    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(frameLayout.getId(),fragment);
        fragmentTransaction.commit();
    }

    //function for mobile back button-> for backbutton click then app not get out
//    work on reset password fragment
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode==KeyEvent.KEYCODE_BACK)
        {
//            SignupFragment.disablecloseBtn=false;
//            SigninFragment.disableCloseBtn=false;
            if (onResetPasswordFragmnet)
            {
                onResetPasswordFragmnet=false;
                setFragmentreset(new SigninFragment());
                return  false;
            }
        }

        return super.onKeyDown(keyCode, event);
    }

    //    fragment set korar jonno function
    private void setFragmentreset(Fragment fragment) {

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_from_left,R.anim.slideout_from_right);
        fragmentTransaction.replace(frameLayout.getId(),fragment);
        fragmentTransaction.commit();
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
