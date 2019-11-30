package com.example.pubgt;

public class EventModel {
    int eventPhoto;
    String eventTitle;
    String eventDetails;
    String date;
    String time;

    public EventModel(int eventPhoto, String eventTitle, String eventDetails, String date, String time) {
        this.eventPhoto = eventPhoto;
        this.eventTitle = eventTitle;
        this.eventDetails = eventDetails;
        this.date = date;
        this.time = time;
    }

    public int getEventPhoto() {
        return eventPhoto;
    }

    public void setEventPhoto(int eventPhoto) {
        this.eventPhoto = eventPhoto;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
