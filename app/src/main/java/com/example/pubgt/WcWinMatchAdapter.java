package com.example.pubgt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WcWinMatchAdapter extends RecyclerView.Adapter<WcWinMatchAdapter.ViewHolder> {
    List<WcWinMatchmodel>wcWinMatchmodelList;

    public WcWinMatchAdapter(List<WcWinMatchmodel> wcWinMatchmodelList) {
        this.wcWinMatchmodelList = wcWinMatchmodelList;
    }

    @NonNull
    @Override
    public WcWinMatchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.wc_win_match_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WcWinMatchAdapter.ViewHolder holder, int position) {

        boolean status=wcWinMatchmodelList.get(position).getStatus();
        int type=wcWinMatchmodelList.get(position).getType();
        int kill=wcWinMatchmodelList.get(position).getKill();
        int wc=wcWinMatchmodelList.get(position).getWc();

        holder.setTable(status,type,kill,wc);

    }

    @Override
    public int getItemCount() {
        return wcWinMatchmodelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView statusT;
        TextView typeT;
        TextView killT;
        TextView wcT;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            statusT=itemView.findViewById(R.id.statusId);
            typeT=itemView.findViewById(R.id.matchtypeId);
            killT=itemView.findViewById(R.id.killId);
            wcT=itemView.findViewById(R.id.wcid);
        }

        private void setTable(boolean status,int type,int kill,int wc)
        {
            //status
            if (status)
            {
                statusT.setText("win");
            }else
            {
                statusT.setText("lose");
            }

            //type
            if (type==1)
            {
                typeT.setText("Solo");
            }else if (type==2)
            {
                typeT.setText("Duel");
            }else if (type==4)
            {
                typeT.setText("Squad");
            }else if (type==5)
            {
                typeT.setText("TDM");
            }

            killT.setText(""+kill);
            wcT.setText(""+wc);

        }
    }
}
