package com.example.pubgt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TournamentFragment extends Fragment {

    RecyclerView tournamentrecyclerView;
    LinearLayout linearLayout;
    TextView no_tournamemtText;
    LottieAnimationView lottieAnimationView;
    List<TournamentModel>tournamentModelList=new ArrayList<>();
    public TournamentFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tournament, container, false);

        tournamentrecyclerView=view.findViewById(R.id.tournamentrecyclerViewId);
        linearLayout=view.findViewById(R.id.TournamentTop);
        lottieAnimationView=view.findViewById(R.id.no_data_animation);
        no_tournamemtText=view.findViewById(R.id.no_tournamemtTextId);

        linearLayout.setVisibility(View.VISIBLE);
        tournamentrecyclerView.setVisibility(View.VISIBLE);
        lottieAnimationView.setVisibility(View.GONE);
        no_tournamemtText.setVisibility(View.GONE);

        //common layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        tournamentrecyclerView.setLayoutManager(layoutManager);
        //list of events
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fight", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",10,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fight", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",75,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fight", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",50,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fight", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",80,false));
        tournamentModelList.add(new TournamentModel(R.drawable.profile, "Big friday fight", "Shanok", "Squed", "100","11/11/2019","2:20pm","2tk","300tk","200tk","100tk",20,false));

        //set event
        TournamentAdapter tournamentAdapter=new TournamentAdapter(tournamentModelList,getContext());
        tournamentrecyclerView.setAdapter(tournamentAdapter);

        ///----------------------------------------------------------------------------------------------------
        //======================================================================================================
        if (tournamentModelList.size()==0)
        {
            linearLayout.setVisibility(View.GONE);
            tournamentrecyclerView.setVisibility(View.GONE);
            lottieAnimationView.setVisibility(View.VISIBLE);
            no_tournamemtText.setVisibility(View.VISIBLE);
        }else {
            linearLayout.setVisibility(View.VISIBLE);
            tournamentrecyclerView.setVisibility(View.VISIBLE);
            lottieAnimationView.setVisibility(View.GONE);
            no_tournamemtText.setVisibility(View.GONE);
        }

        return view;
    }

}
