package com.example.pubgt;

public class ShopModel {
    String uc;
    String ucPrice;

    public ShopModel(String uc, String ucPrice) {
        this.uc = uc;
        this.ucPrice = ucPrice;
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public String getUcPrice() {
        return ucPrice;
    }

    public void setUcPrice(String ucPrice) {
        this.ucPrice = ucPrice;
    }
}
