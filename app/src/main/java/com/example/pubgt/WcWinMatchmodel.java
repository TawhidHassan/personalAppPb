package com.example.pubgt;

public class WcWinMatchmodel {
    Boolean status;
    int type;
    int kill;
    int wc;

    public WcWinMatchmodel(Boolean status, int type, int kill, int wc) {
        this.status = status;
        this.type = type;
        this.kill = kill;
        this.wc = wc;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getWc() {
        return wc;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }
}
