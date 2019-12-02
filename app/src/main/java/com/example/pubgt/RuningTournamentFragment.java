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
public class RuningTournamentFragment extends Fragment {

    RecyclerView runingtournamentrecyclerView;
    List<TournamentModel> tournamentModelList=new ArrayList<>();
    public RuningTournamentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_runing_tournament, container, false);

        runingtournamentrecyclerView=view.findViewById(R.id.runingTournamentrecyclerViewId);
        //common layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);


        runingtournamentrecyclerView.setLayoutManager(layoutManager);

        //list of events
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fightx", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",10,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fighty", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",75,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fightz", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",50,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fightoo", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",80,true));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fightpp", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",20,true));

        //set runing tournament
        //make support list for filter the list
        List<TournamentModel> runningList = getRunningList(tournamentModelList);
        //make support list for filter the list
        RuningTournamentAdapter runingTournamentAdapter=new RuningTournamentAdapter(runningList);
        runingtournamentrecyclerView.setAdapter(runingTournamentAdapter);
        ///----------------------------------------------------------------------------------------------------
        //======================================================================================================
        return view;
    }

    //filter the list by status
    private List<TournamentModel> getRunningList(List<TournamentModel> tournamentModelList) {
        List<TournamentModel> list = new ArrayList<>();
        for (TournamentModel model: tournamentModelList) {
            if (model.isTournamentStatus()){
                list.add(model);
            }
        }
        return list;
    }

}
