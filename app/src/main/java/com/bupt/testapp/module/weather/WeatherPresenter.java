package com.bupt.testapp.module.weather;

import com.bupt.testapp.entry.WeatherEntry;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
* @author Jerry
* create at 2019/4/21 下午4:06
* description:MVP中的Presenter，用来处理数据请求
*/
public class WeatherPresenter implements WeatherContract.Presenter {
    public static final String BASE_URL = "http://www.weather.com.cn/data/cityinfo/";//天气api
    WeatherContract.View weather_View;

    public WeatherPresenter(WeatherContract.View weather_View) {
        this.weather_View = weather_View;
    }

    @Override
    public void getData(String[] cities) {
        List<WeatherEntry> weatherEntities = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
