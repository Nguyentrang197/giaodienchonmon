package com.android.nguyentrang.yummy_app;

public class Menu {

    private String mName;
    private String mImage;
    private String mPrice;

    public Menu(String mName, String mImage, String mPrice) {
        this.mName = mName;
        this.mImage = mImage;
        this.mPrice = mPrice;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    @Override
    public String toString() {
        return mName;
    }
}



