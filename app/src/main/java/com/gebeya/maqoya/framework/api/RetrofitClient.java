package com.gebeya.maqoya.framework.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    private static final String BASE_URL = "https://dc4f535e-7fbe-4a7a-9ff6-fd5e6cb9022f.mock.pstmn.io/api/";
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
