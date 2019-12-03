package com.example.pubgt;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ShopAdapter extends BaseAdapter {

    Context context;
    List<ShopModel>shopModelList;

    public ShopAdapter(Context context, List<ShopModel> shopModelList) {
        this.context = context;
        this.shopModelList = shopModelList;
    }

    @Override
    public int getCount() {
        return shopModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return shopModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.shop_item_layout,null);
        }
        TextView uc=convertView.findViewById(R.id.ucId);
        TextView ucPrice=convertView.findViewById(R.id.ucPriceId);

        uc.setText(shopModelList.get(position).getUc()+"Uc");
        ucPrice.setText(shopModelList.get(position).getUcPrice()+".Tk");


        return convertView;
    }
}
