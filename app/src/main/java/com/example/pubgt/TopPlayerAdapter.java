package com.example.pubgt;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopPlayerAdapter extends RecyclerView.Adapter<TopPlayerAdapter.ViewHolder>{
    List<TopPlayerModel> topPlayerModelList;
    private int lastPosition = -1;

    public TopPlayerAdapter(List<TopPlayerModel> topPlayerModelList) {
        this.topPlayerModelList = topPlayerModelList;
    }
    @NonNull
    @Override
    public TopPlayerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_plyer_layout, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull TopPlayerAdapter.ViewHolder holder, int position) {

        int userPhoto = topPlayerModelList.get(position).getUserPhoto();
        String userName = topPlayerModelList.get(position).getUserName();
        String userpubgName = topPlayerModelList.get(position).getUserPubgName();
        int KillNo = topPlayerModelList.get(position).getKillNo();
        int winNo = topPlayerModelList.get(position).getWinNo();

        holder.setTopPlayer(userPhoto,userName,userpubgName,winNo,KillNo);

    }

    @Override
    public int getItemCount() {
        return topPlayerModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView userPhoto;
        TextView userName;
        TextView userpubgName;
        TextView KillNo;
        TextView winNo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userPhoto = itemView.findViewById(R.id.topPlayeruserPhotoId);
            userName = itemView.findViewById(R.id.topPlyerNameId);
            userpubgName = itemView.findViewById(R.id.topPlyerPubgNameId);
            KillNo = itemView.findViewById(R.id.topPlyerTotalKillId);
            winNo = itemView.findViewById(R.id.topPlyerNoWinMatchId);
        }


        private void setTopPlayer(int photo,final String username,final String pubgName, final int wine,final int kill)
        {
            userPhoto.setImageResource(photo);
            userName.setText(username);
            userpubgName.setText(pubgName);
            winNo.setText(""+wine+" Win");
            KillNo.setText(""+kill+" Kill");

        }
    }
}
