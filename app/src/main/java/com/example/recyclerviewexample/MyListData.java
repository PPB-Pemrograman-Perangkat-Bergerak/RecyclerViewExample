package com.example.recyclerviewexample;

public class MyListData{
    private String description;
    private int imgId;
    private String date;

    public MyListData(String date,String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
        this.date =date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
