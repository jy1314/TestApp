package com.bupt.testapp.module.network;

import android.widget.Toast;

import com.bupt.testapp.entry.WeatherEntry;
import com.bupt.testapp.service.NetWorkService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
* @author Jerry
* create at 2019/4/14 下午11:48
* description: MVP框架中的presenter用来处理数据请求,获取天气
*/
public class NetworkPresenter implements NetWorkContract.Presenter {
    public static final String BASE_URL = "http://www.weather.com.cn/data/cityinfo/";//天气api
    private NetWorkService service;

    NetWorkContract.View mView;

    //构造方法，传入view对象
    public NetworkPresenter(NetWorkContract.View mView) {
        this.mView = mView;
    }

    //获取数据并显示
    @Override
    public void getData(String[] cities) {
        Retrofit retrofit = new Retrofit.Builder()//创建retrofit对象
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(NetWorkService.class);
        Call<WeatherEntry> call = service.getData();
        call.enqueue(new Callback<WeatherEntry>() {
            @Override
            public void onResponse(Call<WeatherEntry> call, Response<WeatherEntry> response) {
                WeatherEntry weather = response.body();
                mView.setData(weather);
            }

            @Override
            public void onFailure(Call<WeatherEntry> call, Throwable t) {
            }
        });
    }


}
