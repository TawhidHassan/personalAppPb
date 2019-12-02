package com.example.pubgt;

public class TournamentModel {
    int tournamentPhoto;
    String tournamnetName;
    String tournamnetMap;
    String tournamnetType;
    String tournamnetTotalPlayers;
    String tournamnetDate;
    String tournamnetTime;
    String perKill;
    String firstPrice;
    String sceoundPrice;
    String thirdPrice;
    int playerJoin;
    boolean tournamentStatus;

    public TournamentModel(int tournamentPhoto, String tournamnetName, String tournamnetMap, String tournamnetType, String tournamnetTotalPlayers, String tournamnetDate, String tournamnetTime, String perKill, String firstPrice, String sceoundPrice, String thirdPrice, int playerJoin, boolean tournamentStatus) {
        this.tournamentPhoto = tournamentPhoto;
        this.tournamnetName = tournamnetName;
        this.tournamnetMap = tournamnetMap;
        this.tournamnetType = tournamnetType;
        this.tournamnetTotalPlayers = tournamnetTotalPlayers;
        this.tournamnetDate = tournamnetDate;
        this.tournamnetTime = tournamnetTime;
        this.perKill = perKill;
        this.firstPrice = firstPrice;
        this.sceoundPrice = sceoundPrice;
        this.thirdPrice = thirdPrice;
        this.playerJoin = playerJoin;
        this.tournamentStatus = tournamentStatus;
    }

    public int getTournamentPhoto() {
        return tournamentPhoto;
    }

    public void setTournamentPhoto(int tournamentPhoto) {
        this.tournamentPhoto = tournamentPhoto;
    }

    public String getTournamnetName() {
        return tournamnetName;
    }

    public void setTournamnetName(String tournamnetName) {
        this.tournamnetName = tournamnetName;
    }

    public String getTournamnetMap() {
        return tournamnetMap;
    }

    public void setTournamnetMap(String tournamnetMap) {
        this.tournamnetMap = tournamnetMap;
    }

    public String getTournamnetType() {
        return tournamnetType;
    }

    public void setTournamnetType(String tournamnetType) {
        this.tournamnetType = tournamnetType;
    }

    public String getTournamnetTotalPlayers() {
        return tournamnetTotalPlayers;
    }

    public void setTournamnetTotalPlayers(String tournamnetTotalPlayers) {
        this.tournamnetTotalPlayers = tournamnetTotalPlayers;
    }

    public String getTournamnetDate() {
        return tournamnetDate;
    }

    public void setTournamnetDate(String tournamnetDate) {
        this.tournamnetDate = tournamnetDate;
    }

    public String getTournamnetTime() {
        return tournamnetTime;
    }

    public void setTournamnetTime(String tournamnetTime) {
        this.tournamnetTime = tournamnetTime;
    }

    public String getPerKill() {
        return perKill;
    }

    public void setPerKill(String perKill) {
        this.perKill = perKill;
    }

    public String getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(String firstPrice) {
        this.firstPrice = firstPrice;
    }

    public String getSceoundPrice() {
        return sceoundPrice;
    }

    public void setSceoundPrice(String sceoundPrice) {
        this.sceoundPrice = sceoundPrice;
    }

    public String getThirdPrice() {
        return thirdPrice;
    }

    public void setThirdPrice(String thirdPrice) {
        this.thirdPrice = thirdPrice;
    }

    public int getPlayerJoin() {
        return playerJoin;
    }

    public void setPlayerJoin(int playerJoin) {
        this.playerJoin = playerJoin;
    }

    public boolean isTournamentStatus() {
        return tournamentStatus;
    }

    public void setTournamentStatus(boolean tournamentStatus) {
        this.tournamentStatus = tournamentStatus;
    }
}
