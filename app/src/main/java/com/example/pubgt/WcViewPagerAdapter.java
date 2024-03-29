package com.example.pubgt;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class WcViewPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment>fragmentArrayList=new ArrayList<>();
    private final ArrayList<String> fragmentList=new ArrayList<>();


    public WcViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    public void addFragment(Fragment fragment,String title)
    {
        fragmentArrayList.add(fragment);
        fragmentList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
