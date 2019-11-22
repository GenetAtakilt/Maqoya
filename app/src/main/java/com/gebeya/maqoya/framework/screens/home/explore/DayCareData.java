package com.gebeya.maqoya.framework.screens.home.explore;

public class DayCareData {

    private int id;
    private int picture;
    private String name;
    private String location;
    private String availableSlots;


    public DayCareData(int id, int picture, String name, String location, String availableSlots) {
        this.id = id;
        this.picture = picture;
        this.name = name;
        this.location = location;
        this.availableSlots = availableSlots;
    }

    public int getId() {
        return id;
    }

    public int getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getAvailableSlots() {
        return availableSlots;
    }

}