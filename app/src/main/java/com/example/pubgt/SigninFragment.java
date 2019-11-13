package com.example.pubgt;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SigninFragment extends Fragment {

    TextView regesterAcBtn;
    TextView resetPasswordBtn;
    ImageButton loginBtn;



    public SigninFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_signin, container, false);
        regesterAcBtn=view.findViewById(R.id.regesterAcBtnId);
        resetPasswordBtn=view.findViewById(R.id.resetPasswordId);
        loginBtn=view.findViewById(R.id.loginBtnId);

        regesterAcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SignupFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.RegesterFrameLayoutId, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        //password reset fragment
        resetPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegesterActivity.onResetPasswordFragmnet = true;
                setFragmentforget(new ResetPasswordFragment());
            }
        });

        //wellcome screen swipe up
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), WellcomeActivity.class);
                Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getActivity(), R.anim.slide_from_left,R.anim.slideout_from_right).toBundle();
                startActivity(mainIntent,bndlanimation);

            }
        });
        return view;
    }

    //forget password fragment
    private void setFragmentforget(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_from_right, R.anim.slideout_from_left);
        fragmentTransaction.replace(R.id.RegesterFrameLayoutId, fragment);
        fragmentTransaction.commit();
    }

}
