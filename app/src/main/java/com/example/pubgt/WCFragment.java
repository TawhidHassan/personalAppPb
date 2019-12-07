package com.example.pubgt;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class WCFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    public WCFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_wc, container, false);

        tabLayout=view.findViewById(R.id.wctabLayoutId);
        viewPager=view.findViewById(R.id.wcViewPagerID);


        tabLayout.setTabTextColors(Color.parseColor("#221131"), Color.parseColor("#221131"));

        setviewPagerAdapter(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Status");
        tabLayout.getTabAt(1).setText("Win Match");
        tabLayout.getTabAt(2).setText("Exchange Tk");

        return view;
    }

    private void setviewPagerAdapter(ViewPager viewPager)
    {
        WcViewPagerAdapter wcViewPagerAdapter=new WcViewPagerAdapter(getFragmentManager());
        wcViewPagerAdapter.addFragment(new WcStatusFragment(),"status");
        wcViewPagerAdapter.addFragment(new WcMatchWineFragment(),"win Match");
        wcViewPagerAdapter.addFragment(new ExchangeTkFragment(),"Exchange wc");

        viewPager.setAdapter(wcViewPagerAdapter);
    }
}
