package com.bupt.testapp.module.network;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
import com.bupt.testapp.entry.WeatherEntry;
import com.bupt.testapp.service.NetWorkService;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
* @author Jerry
* create at 2019/4/13 下午5:55
* description:网络连接测试类，用Retrofit框架+RxJava
*/
public class NetworkActivity extends BaseActivity {

    public static final String BASE_URL = "http://www.weather.com.cn/data/cityinfo/";//天气api

    @BindView(R.id.network_but_01)
    Button but_1;
    @BindView(R.id.network_text_01)
    TextView textView;

    private NetWorkService service;
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.avtivity_network;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        initRetrofit();

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @OnClick(R.id.network_but_01)
    public void onClick_but1(){
        getWeather();
    }

    private void initRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()//创建retrofit对象
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(NetWorkService.class);
    }
    public void getWeather(){
        Call<WeatherEntry> call = service.getData();
        call.enqueue(new Callback<WeatherEntry>() {
            @Override
            public void onResponse(Call<WeatherEntry> call, Response<WeatherEntry> response) {
                Toast.makeText(NetworkActivity.this, "success", Toast.LENGTH_SHORT).show();
                WeatherEntry weather = response.body();
                textView.setText(weather.toString());
            }

            @Override
            public void onFailure(Call<WeatherEntry> call, Throwable t) {
                Toast.makeText(NetworkActivity.this, "fail", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
