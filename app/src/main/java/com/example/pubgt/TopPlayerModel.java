package com.example.pubgt;

public class TopPlayerModel {
    private int userPhoto;
    private String userName;
    private String userPubgName;
    private int killNo;
    private int winNo;

    public TopPlayerModel(int userPhoto, String userName, String userPubgName, int killNo, int winNo) {
        this.userPhoto = userPhoto;
        this.userName = userName;
        this.userPubgName = userPubgName;
        this.killNo = killNo;
        this.winNo = winNo;
    }

    public int getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPubgName() {
        return userPubgName;
    }

    public void setUserPubgName(String userPubgName) {
        this.userPubgName = userPubgName;
    }

    public int getKillNo() {
        return killNo;
    }

    public void setKillNo(int killNo) {
        this.killNo = killNo;
    }

    public int getWinNo() {
        return winNo;
    }

    public void setWinNo(int winNo) {
        this.winNo = winNo;
    }
}
