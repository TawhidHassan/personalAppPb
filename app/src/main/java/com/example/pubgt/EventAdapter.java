package com.example.pubgt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    List<EventModel>eventModelList;

    public EventAdapter(List<EventModel> eventModelList) {
        this.eventModelList = eventModelList;
    }


    @NonNull
    @Override
    public EventAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.ViewHolder holder, int position) {
            int photo=eventModelList.get(position).getEventPhoto();
            String title=eventModelList.get(position).getEventTitle();
            String details=eventModelList.get(position).getEventDetails();
            String date=eventModelList.get(position).getDate();
            String time=eventModelList.get(position).getTime();

            holder.setEvent(photo,title,details,date,time);
    }

    @Override
    public int getItemCount() {
        return eventModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView eventPhoto;
        TextView title;
        TextView detail;
        TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventPhoto=itemView.findViewById(R.id.eventPhotoId);
            title=itemView.findViewById(R.id.eventTitleId);
            date=itemView.findViewById(R.id.eventDateTimeId);
            detail=itemView.findViewById(R.id.eventDetailsId);
        }
        public void setEvent(int photo,String titlex,String details,String datex,String time)
        {
            eventPhoto.setImageResource(photo);
            title.setText(titlex);
            detail.setText(details);
            date.setText(datex+" "+"Time:"+time);
        }
    }
}
