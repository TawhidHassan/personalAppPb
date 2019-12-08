package com.example.pubgt;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class WcStatusFragment extends Fragment {

    PieChart pieChart;
    public WcStatusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_wc_status, container, false);
        //pie Chaert
        pieChart=view.findViewById(R.id.pichartId);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
//        pieChart.setExtraOffsets(50,50,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.99f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        pieChart.animateY(2000, Easing.EaseInOutCubic);

        ArrayList<PieEntry> pichartValue=new ArrayList<>();
        pichartValue.add(new PieEntry(200,"Wc"));
        pichartValue.add(new PieEntry(500,"Wc"));

        //discription
//        Description description=new Description();
//        description.setText("this is chart for countries earning");
//        description.setTextSize(15);
//        pieChart.setDescription(description);

        PieDataSet pieDataSet=new PieDataSet(pichartValue,":Balance");
        //to different pie slice middle spaces
        pieDataSet.setSliceSpace(3f);
        pieDataSet.setSelectionShift(5f);
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData pieData=new PieData(pieDataSet);
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.YELLOW);

        pieChart.setData(pieData);
        //pie Chaert

        return view;
    }

}
