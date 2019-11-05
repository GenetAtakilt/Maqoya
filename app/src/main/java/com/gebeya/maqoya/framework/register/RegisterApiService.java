package com.gebeya.maqoya.framework.register;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterApiService {

    @FormUrlEncoded
    @POST("parents/register")
    Call<DefultResponse> registerUser (
            @Field("name")  String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("phoneNumber") String confirmPassword );



}
