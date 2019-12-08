package com.example.pubgt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WcMatchWineFragment extends Fragment {


    RecyclerView WcMatchRecyclerView;
    List<WcWinMatchmodel>wcWinMatchmodelList=new ArrayList<>();
    public WcMatchWineFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_wc_match_wine, container, false);

        WcMatchRecyclerView=view.findViewById(R.id.WcMatchRecyclerViewId);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        WcMatchRecyclerView.setLayoutManager(linearLayoutManager);

        wcWinMatchmodelList.add(new WcWinMatchmodel(true,1,12,24));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,2,13,26));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,4,55,124));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,4,55,124));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,4,55,124));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,4,77,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,4,77,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,4,77,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,4,77,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(true,4,77,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));
        wcWinMatchmodelList.add(new WcWinMatchmodel(false,2,52,234));

       WcWinMatchAdapter wcWinMatchAdapter=new WcWinMatchAdapter(wcWinMatchmodelList);
        WcMatchRecyclerView.setAdapter(wcWinMatchAdapter);

        return view;
    }

}
