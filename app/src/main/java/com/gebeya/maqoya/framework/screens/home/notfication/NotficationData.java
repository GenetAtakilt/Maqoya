package com.gebeya.maqoya.framework.screens.home.notfication;

public class NotficationData {

    private int id;
    private String notficationText;

    public NotficationData(int id, String notficationText) {
        this.id = id;
        this.notficationText = notficationText;
    }

    public int getId() {
        return id;
    }

    public String getNotficationText() {
        return notficationText;
    }
}
