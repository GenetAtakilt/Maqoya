package com.gebeya.maqoya.framework.models;

import com.google.gson.annotations.SerializedName;

public class DefultResponse {

    @SerializedName("id")
    private String id;

    @SerializedName("email")
    private String  email;

    @SerializedName("phoneNumber")
    private int   phone;


    public DefultResponse(String id, String email, int phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}

