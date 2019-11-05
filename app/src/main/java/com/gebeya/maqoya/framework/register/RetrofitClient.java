package com.gebeya.maqoya.framework.register;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://8726fcc6-5918-4cfa-88a5-4e37a3b27dca.mock.pstmn.io/api/";
    private static RetrofitClient retrofitClient;
    private Retrofit retrofit;


    private RetrofitClient()
    {
        retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                   .build();
    }


    public static synchronized RetrofitClient getRetrofitClient()

    {
        if (retrofitClient == null)
        {
            retrofitClient = new RetrofitClient();
        }

        return retrofitClient;
    }

    public RegisterApiService registerApiService()
    {
        return retrofit.create(RegisterApiService.class);
    }

}
