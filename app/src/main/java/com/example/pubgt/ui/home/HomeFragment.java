package com.example.pubgt.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.pubgt.R;
import com.example.pubgt.SliderAdapter;
import com.example.pubgt.SliderModel;
import com.example.pubgt.TopPlayerAdapter;
import com.example.pubgt.TopPlayerModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    //slider banner
    private ViewPager bannerSliderViewPager;
    private List<SliderModel> sliderModelList;
    private int cureentSlider = 2;
    private Timer timer;
    final private long Delay_time = 3000;
    final private long Period_time = 3000;
    //slider banner

    //top player
    private RecyclerView topPlayerRecyclerView;
    private List<TopPlayerModel> topPlayerModelList = new ArrayList<>();
    //top player

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
// topPlayer RecyclerView
        topPlayerRecyclerView = view.findViewById(R.id.tprecId);
        //topPlayer RecyclerView

        //baner slider viewPager
        bannerSliderViewPager = view.findViewById(R.id.banner_sliderViewPagerId);

        //top banner slider
        sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));

        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.photoeight));
        sliderModelList.add(new SliderModel(R.drawable.photoeight));

        sliderModelList.add(new SliderModel(R.drawable.banner));
        sliderModelList.add(new SliderModel(R.drawable.banner));

        SliderAdapter sliderAdapter = new SliderAdapter(sliderModelList);
        bannerSliderViewPager.setAdapter(sliderAdapter);
        bannerSliderViewPager.setClipToPadding(false);
        bannerSliderViewPager.setPageMargin(20);

        //view Pager listener
        bannerSliderViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                cureentSlider = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state == ViewPager.SCROLL_STATE_IDLE) {
                    pageLooper(sliderModelList);
                }
            }
        });
        startBannerSlideShow();

        bannerSliderViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pageLooper(sliderModelList);
                stopBannerSlide();
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    startBannerSlideShow();
                }
                return false;
            }
        });
        //top banner slider
        ///----------------------------------------------------------------------------------------------------
        //======================================================================================================


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        topPlayerRecyclerView.setLayoutManager(layoutManager);

        topPlayerModelList.add(new TopPlayerModel(R.drawable.profile, "Sifat Hassan", "sifat007", 32, 20));
        topPlayerModelList.add(new TopPlayerModel(R.drawable.profile, "Sifat Hassan", "sifat007", 32, 20));
        topPlayerModelList.add(new TopPlayerModel(R.drawable.profile, "Sifat Hassan", "sifat007", 32, 20));
        topPlayerModelList.add(new TopPlayerModel(R.drawable.profile, "Sifat Hassan", "sifat007", 32, 20));
        topPlayerModelList.add(new TopPlayerModel(R.drawable.profile, "Sifat Hassan", "sifat007", 32, 20));

        TopPlayerAdapter topPlayerAdapter = new TopPlayerAdapter(topPlayerModelList);


        topPlayerRecyclerView.setAdapter(topPlayerAdapter);

        return view;
    }

    //for slider banner auto scrool
    private void pageLooper(List<SliderModel> sliderModelList) {
        if (cureentSlider == sliderModelList.size() - 2) {
            cureentSlider = 2;
            bannerSliderViewPager.setCurrentItem(cureentSlider, false);
        }
        if (cureentSlider == 1) {
            cureentSlider = sliderModelList.size() - 3;
            bannerSliderViewPager.setCurrentItem(cureentSlider, false);
        }
    }

    private void startBannerSlideShow() {
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if (cureentSlider >= sliderModelList.size()) {
                    cureentSlider = -1;
                }
                bannerSliderViewPager.setCurrentItem(cureentSlider++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        }, Delay_time, Period_time);
    }

    private void stopBannerSlide() {
        timer.cancel();
    }
}