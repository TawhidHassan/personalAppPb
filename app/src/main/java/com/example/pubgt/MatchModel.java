package com.example.pubgt;

public class MatchModel {
    String tournamentName;
    String mapName;
    int tournamentPhoto;
    int totalPalyer;
    int numberJoinOfPlayer;
    int type;
    String date;
    String time;
    Boolean matchStatus;
    int firstPrice;
    int secoundPrice;
    int thirdPrice;
    int winPrice;
    int totalPrice;

    public MatchModel(String tournamentName, String mapName, int tournamentPhoto, int totalPalyer, int numberJoinOfPlayer, int type, String date, String time, Boolean matchStatus, int firstPrice, int secoundPrice, int thirdPrice, int winPrice, int totalPrice) {
        this.tournamentName = tournamentName;
        this.mapName = mapName;
        this.tournamentPhoto = tournamentPhoto;
        this.totalPalyer = totalPalyer;
        this.numberJoinOfPlayer = numberJoinOfPlayer;
        this.type = type;
        this.date = date;
        this.time = time;
        this.matchStatus = matchStatus;
        this.firstPrice = firstPrice;
        this.secoundPrice = secoundPrice;
        this.thirdPrice = thirdPrice;
        this.winPrice = winPrice;
        this.totalPrice = totalPrice;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getTournamentPhoto() {
        return tournamentPhoto;
    }

    public void setTournamentPhoto(int tournamentPhoto) {
        this.tournamentPhoto = tournamentPhoto;
    }

    public int getTotalPalyer() {
        return totalPalyer;
    }

    public void setTotalPalyer(int totalPalyer) {
        this.totalPalyer = totalPalyer;
    }

    public int getNumberJoinOfPlayer() {
        return numberJoinOfPlayer;
    }

    public void setNumberJoinOfPlayer(int numberJoinOfPlayer) {
        this.numberJoinOfPlayer = numberJoinOfPlayer;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public Boolean getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Boolean matchStatus) {
        this.matchStatus = matchStatus;
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getSecoundPrice() {
        return secoundPrice;
    }

    public void setSecoundPrice(int secoundPrice) {
        this.secoundPrice = secoundPrice;
    }

    public int getThirdPrice() {
        return thirdPrice;
    }

    public void setThirdPrice(int thirdPrice) {
        this.thirdPrice = thirdPrice;
    }

    public int getWinPrice() {
        return winPrice;
    }

    public void setWinPrice(int winPrice) {
        this.winPrice = winPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
