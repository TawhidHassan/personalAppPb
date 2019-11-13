package com.example.pubgt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context context;
    List<IntroModel>introModelList;

    public IntroViewPagerAdapter(Context context, List<IntroModel> screenItemList) {
        this.context = context;
        this.introModelList = screenItemList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen=inflater.inflate(R.layout.into_layout,null);

        ImageView imagSlide=layoutScreen.findViewById(R.id.intro_imgId);
        TextView title=layoutScreen.findViewById(R.id.introTitle);
        TextView description=layoutScreen.findViewById(R.id.intro_descriptionId);

        imagSlide.setImageResource(introModelList.get(position).getScreenImg());
        title.setText(introModelList.get(position).getTitle());
        description.setText(introModelList.get(position).getDescription());

        container.addView(layoutScreen);

        return layoutScreen;
    }

    @Override
    public int getCount() {
        return introModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
