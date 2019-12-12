package com.example.pubgt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExchangeTkFragment extends Fragment {
    //sheet layout popup
    private BottomSheetBehavior bottomSheetBehavior;
    Button sheetCloseBooton;
    Button sheetButton;
    //sheet layout popup

    Button sendRequestBooton;

    ImageView toastIcon;
    TextView toastText;

    public ExchangeTkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_exchange_tk, container, false);

        //weekUp to bootom layout
        View bottomSheet = view.findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        sheetButton = view.findViewById(R.id.exchangeBottonId);
        sheetCloseBooton = view.findViewById(R.id.sheetCloseBootonId);
        sendRequestBooton = view.findViewById(R.id.sendRequestBootonId);

        //sheet layout popup
        sheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
        sheetCloseBooton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setHideable(true);//Important to add
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            }
        });
        //sheet layout popup

        //coustome toast inflate
        LayoutInflater inflater1 = getLayoutInflater();
        final View layout = inflater1.inflate(R.layout.coustome_toast, (ViewGroup) view.findViewById(R.id.custom_toast_container));
        toastIcon = layout.findViewById(R.id.toastIConId);
        toastText = (TextView) layout.findViewById(R.id.toastTextId);
        final Toast toast = new Toast(getActivity());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        //coustome toast inflate
        sendRequestBooton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toastIcon.setImageResource(R.drawable.ic_done_all_black_24dp);
                toastText.setText("Request done, you will get money as soon as possible");

                //ide popip sheet
                bottomSheetBehavior.setHideable(true);//Important to add
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                toast.show();
            }
        });


        return view;
    }

}
