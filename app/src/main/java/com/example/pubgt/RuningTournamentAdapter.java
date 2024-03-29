package com.example.pubgt;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RuningTournamentAdapter extends RecyclerView.Adapter<RuningTournamentAdapter.ViewHolder> {
    List<TournamentModel> tournamentModelList;

    public RuningTournamentAdapter(List<TournamentModel> tournamentModelList) {
        this.tournamentModelList = tournamentModelList;
    }
    @NonNull
    @Override
    public RuningTournamentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tournament_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int tournamentPhoto=tournamentModelList.get(position).getTournamentPhoto();
        String tournamentName=tournamentModelList.get(position).getTournamnetName();
        String tournamentType=tournamentModelList.get(position).getTournamnetType();
        String tournamentMap=tournamentModelList.get(position).getTournamnetMap();
        String tournamentdate=tournamentModelList.get(position).getTournamnetDate();
        String tournamentTime=tournamentModelList.get(position).getTournamnetTime();
        String tournamentTotalPlayer=tournamentModelList.get(position).getTournamnetTime();
        String firstPrice=tournamentModelList.get(position).getFirstPrice();
        String sceoundPrice=tournamentModelList.get(position).getSceoundPrice();
        String thirdPrice=tournamentModelList.get(position).getThirdPrice();
        String perKill=tournamentModelList.get(position).getPerKill();
        int joinPlayer=tournamentModelList.get(position).getPlayerJoin();
        boolean status=tournamentModelList.get(position).tournamentStatus;
        if (status)
        {

            holder.setTournament(tournamentPhoto,tournamentName,tournamentType,tournamentMap,tournamentTotalPlayer,tournamentdate,tournamentTime,firstPrice,sceoundPrice,thirdPrice,perKill,joinPlayer,status);
        }

    }


    @Override
    public int getItemCount() {

        return tournamentModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView Tphoto;
        TextView TName;
        TextView Ttype;
        TextView TMapName;
        TextView TTotalPlayer;
        TextView TDate;
        TextView Ttime;
        TextView Tfirstprice;
        TextView TSceoundprice;
        TextView Tthirdprice;
        TextView TPerKill;
        TextView TJoinPlayer;
        Button joinBtn;
        ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Tphoto=itemView.findViewById(R.id.tournamentxPhotoId);
            TName=itemView.findViewById(R.id.tournamenttitleId);
            Ttype=itemView.findViewById(R.id.typeId);
            TMapName=itemView.findViewById(R.id.mapId);
            TTotalPlayer=itemView.findViewById(R.id.totalPlayerId);
            TDate=itemView.findViewById(R.id.dateId);
            Ttime=itemView.findViewById(R.id.timeId);
            Tfirstprice=itemView.findViewById(R.id.firstPriceId);
            TSceoundprice=itemView.findViewById(R.id.scoundPriceId);
            Tthirdprice=itemView.findViewById(R.id.thirdPriceId);
            TPerKill=itemView.findViewById(R.id.perKillId);
            TJoinPlayer=itemView.findViewById(R.id.joinPlayerCountId);
            joinBtn=itemView.findViewById(R.id.joinBtnId);
            progressBar=itemView.findViewById(R.id.joinPlayerProgressBarId);
        }
        @SuppressLint("ResourceAsColor")
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        private void setTournament(int photo, String name, String type, String map, String totalPlayer, String date, String time, String first, String sceound, String third, String perKill, int join,boolean status)
        {
            Tphoto.setImageResource(photo);
            TName.setText(name);
            Ttype.setText(type);
            TMapName.setText(map);
            TTotalPlayer.setText(totalPlayer);
            TDate.setText(date);
            Ttime.setText(time);
            Tfirstprice.setText(first);
            TSceoundprice.setText(sceound);
            Tthirdprice.setText(third);
            TPerKill.setText(perKill);
            TJoinPlayer.setText("100/"+join);
            progressBar.setProgress(join);
            progressBar.setProgressTintList(ColorStateList.valueOf(R.color.mainColor));
            if (status)
            {
                joinBtn.setEnabled(false);
                joinBtn.setText("Runing");
                joinBtn.setTextColor(R.color.part3);
            }

        }
    }
}


