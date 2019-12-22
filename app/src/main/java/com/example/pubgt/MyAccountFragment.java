package com.example.pubgt;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyAccountFragment extends Fragment {


    public MyAccountFragment() {
        // Required empty public constructor
    }

    LinearLayout accountBtn;
    LinearLayout addPaymentMethodBtn;
    LinearLayout changePasswordBtn;
    LinearLayout updateBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_account, container, false);
        accountBtn=view.findViewById(R.id.accountBtnId);
        addPaymentMethodBtn=view.findViewById(R.id.addPaymentInfoBtnId);
        changePasswordBtn=view.findViewById(R.id.changePasswordBtnId);
        updateBtn=view.findViewById(R.id.updateBtnId);


        accountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(getActivity(),MyAccountActivity.class);
                getActivity().startActivity(accountIntent);
                getActivity().overridePendingTransition(R.anim.slide_from_left, R.anim.slideout_from_right);


            }
        });
        addPaymentMethodBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(getActivity(),AddPaymentMethodActivity.class);
                getActivity().startActivity(accountIntent);
                getActivity().overridePendingTransition(R.anim.slide_from_left, R.anim.slideout_from_right);

            }
        });
        changePasswordBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(getActivity(),ChangePasswordActivity.class);
                getActivity().startActivity(accountIntent);
                getActivity().overridePendingTransition(R.anim.slide_from_left, R.anim.slideout_from_right);

            }
        });
        updateBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accountIntent=new Intent(getActivity(),UpdatePersonalDataActivity.class);
                getActivity().startActivity(accountIntent);
                getActivity().overridePendingTransition(R.anim.slide_from_left, R.anim.slideout_from_right);

            }
        });
        return view;
    }

}
