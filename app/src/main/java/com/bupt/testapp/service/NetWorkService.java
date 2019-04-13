package com.bupt.testapp.service;

import com.bupt.testapp.entry.WeatherEntry;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetWorkService {

    @GET("101010100.html")
    Call<WeatherEntry> getData();
}
