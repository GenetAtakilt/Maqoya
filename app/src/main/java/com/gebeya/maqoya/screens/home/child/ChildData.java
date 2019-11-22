package com.gebeya.maqoya.screens.home.child;

public class ChildData {

    private int id;
    private int childPhoto;
    private String childName;
    private String dayCareName;
    private String hourSpent;

    public ChildData(int id, int childPhoto, String childName, String dayCareName, String hourSpent) {
        this.id = id;
        this.childPhoto = childPhoto;
        this.childName = childName;
        this.dayCareName = dayCareName;
        this.hourSpent = hourSpent;
    }

    public int getId() {
        return id;
    }

    public int getChildPhoto() {
        return childPhoto;
    }

    public String getChildName() {
        return childName;
    }

    public String getDayCareName() {
        return dayCareName;
    }

    public String getHourSpent() {
        return hourSpent;
    }
}
