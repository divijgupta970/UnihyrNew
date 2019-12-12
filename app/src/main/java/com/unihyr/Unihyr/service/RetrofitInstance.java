package com.unihyr.Unihyr.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static String BASE_URL="https://demorms.unihyr.com";
    private static Retrofit retrofit=null;
    public static DataService getService(){
        if (retrofit==null){
            retrofit=new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(DataService.class);
    }
}
