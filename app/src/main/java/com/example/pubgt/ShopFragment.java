package com.example.pubgt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {


    GridView shopGridView;
    List<ShopModel>shopModelList=new ArrayList<>();

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_shop, container, false);
        shopGridView=view.findViewById(R.id.shopGridViewId);

        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));
        shopModelList.add(new ShopModel("300","300"));

        ShopAdapter shopAdapter=new ShopAdapter(getContext(),shopModelList);
        shopGridView.setAdapter(shopAdapter);



        return view;
    }

}
