package com.example.pubgt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ViewHolder>{
    List<MatchModel> matchModelList ;
    private int lastPosition = -1;

    public MatchAdapter(List<MatchModel> matchModelList) {
        this.matchModelList = matchModelList;
    }

    @NonNull
    @Override
    public MatchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.runing_match_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchAdapter.ViewHolder holder, int position) {
        String tournamentName=matchModelList.get(position).getTournamentName();
        String mapName=matchModelList.get(position).getMapName();
        int tournamentPhoto=matchModelList.get(position).getTournamentPhoto();
        int totalPalyer=matchModelList.get(position).getTotalPalyer();
        int numberJoinOfPlayer=matchModelList.get(position).getNumberJoinOfPlayer();
        int type=matchModelList.get(position).getType();
        String date=matchModelList.get(position).getDate();
        String time=matchModelList.get(position).getTime();
        Boolean matchStatus=matchModelList.get(position).getMatchStatus();
        int firstPrice=matchModelList.get(position).getFirstPrice();
        int secoundPrice=matchModelList.get(position).getSecoundPrice();
        int thirdPrice=matchModelList.get(position).getThirdPrice();
        int winPrice=matchModelList.get(position).getWinPrice();
        int totalprice=matchModelList.get(position).getTotalPrice();

        holder.setView(tournamentPhoto,tournamentName,totalprice,totalPalyer);
    }

    @Override
    public int getItemCount() {
        return matchModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tournamentName;
        TextView pricex;
        TextView joinPlayerx;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.tournamentPhotId);
            tournamentName=itemView.findViewById(R.id.tournamentNameId);
            pricex=itemView.findViewById(R.id.priceMoneyId);
            joinPlayerx=itemView.findViewById(R.id.playerJoinStatusId);
        }

        public void setView(final int Tphoto,final String name,final int price,final int joinPlayer) {
            imageView.setImageResource(Tphoto);
            tournamentName.setText(name);
            pricex.setText(""+price);
            joinPlayerx.setText(""+joinPlayer);
        }
    }
}
