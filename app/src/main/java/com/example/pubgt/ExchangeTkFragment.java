package com.example.pubgt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetBehavior;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExchangeTkFragment extends Fragment {

    private BottomSheetBehavior bottomSheetBehavior;
    Button sheetCloseBooton;
    Button sheetButton;
    public ExchangeTkFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_exchange_tk, container, false);

        //weekUp to bootom layout
        View bottomSheet = view.findViewById(R.id.bottom_sheet);
        bottomSheetBehavior =BottomSheetBehavior.from(bottomSheet);

         sheetButton = view.findViewById(R.id.exchangeBottonId);
         sheetCloseBooton = view.findViewById(R.id.sheetCloseBootonId);
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
        //weekUp to bootom layout


        return view;
    }

}
