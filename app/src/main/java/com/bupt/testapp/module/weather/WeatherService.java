package com.bupt.testapp.module.weather;

import com.bupt.testapp.entry.WeatherEntry;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/*
* @author Jerry
* create at 2019/4/21 下午4:11
* description:retrofit 定义网络请求
*/
public interface WeatherService {

    @GET("101010100.html")
    Observable<WeatherEntry> getweather();



}
