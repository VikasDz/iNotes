package com.t.inotes.Api;

import android.widget.Toast;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class ApiHandler {

    private static final String BASE_URL = "https://api.jdoodle.com/v1/";
    public static final String API_ID = "a4decdcb46591bce0241a80b3793e7ff";
    public static final String API_SECRET = "9a7dc8064d3fd36e2f0564a0b00c4db6b2fe3825a8dba41dd2e80d76417ab483";
    public static final String LANGUAGE = "java";
    public static final String VERSION_INDEX = "4";


    private static Retrofit retrofit;

    public static ApiService getRetrofitInstance(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }

//        return retrofit.create(ApiService.class);

        ApiService AP = retrofit.create(ApiService.class);
        return AP;
//        InterfaceForCategory myService = retrofit.create(InterfaceForCategory.class);
    }

}