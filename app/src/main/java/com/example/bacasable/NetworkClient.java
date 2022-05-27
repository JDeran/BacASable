package com.example.bacasable;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {
    private static Retrofit retrofit;
    private static String BASE_URL = "http://192.168.1.68:5000/";

    public static Retrofit getRetrofit(String baseUrl) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        if(retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("http://" + baseUrl + ":5000/").
                    addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
        }

        return retrofit;
    }
}
d