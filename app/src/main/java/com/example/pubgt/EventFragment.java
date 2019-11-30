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
public class EventFragment extends Fragment {
    RecyclerView eventRecyclerView;
    List<EventModel>eventModelList=new ArrayList<>();
    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ///----------------------------------------------------------------------------------------------------
        //======================================================================================================
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_event, container, false);
        eventRecyclerView=view.findViewById(R.id.eventListrecyclerViewId);

        //common layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        eventRecyclerView.setLayoutManager(layoutManager);
        //list of events
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));
        eventModelList.add(new EventModel(R.drawable.profile, "Big friday", "win e match you  get 1.Wc, 5 kill you earn 1 not fixed That amount of wc", "11/11/2019", "02:12"));

        //set event
        EventAdapter eventAdapter=new EventAdapter(eventModelList);
        eventRecyclerView.setAdapter(eventAdapter);
        ///----------------------------------------------------------------------------------------------------
        //======================================================================================================

        return view;
    }

}
