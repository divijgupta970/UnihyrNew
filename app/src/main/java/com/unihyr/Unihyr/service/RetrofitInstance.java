package com.unihyr.Unihyr.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static String BASE_URL="https://demorms.unihyr.com";
    private static String BASE_URL_TEMP="https://demorms.unihyr.com";

    //https://demorms.unihyr.com/demo/api/hrmanagepositionlistapi?postId=199&filterBy=all&selected_channel=0;
    private static Retrofit retrofit=null;
    private static Retrofit retrofitTemp=null;
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
    public static DataServiceTemp getTempService(){
        if (retrofitTemp==null){
            retrofitTemp=new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL_TEMP)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitTemp.create(DataServiceTemp.class);
    }
}
