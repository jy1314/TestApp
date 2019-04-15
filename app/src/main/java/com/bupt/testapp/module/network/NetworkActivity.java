package com.bupt.testapp.module.network;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
import com.bupt.testapp.entry.WeatherEntry;
import com.bupt.testapp.service.NetWorkService;

import java.util.List;

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

public class NetworkActivity extends BaseActivity implements NetWorkContract.View{

    NetworkPresenter networkPresenter;

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
        networkPresenter = new NetworkPresenter(this);


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @OnClick(R.id.network_but_01)
    public void onClick_but1(){
        String[] cities = new String[]{"杭州", "绍兴", "成都", "武汉", "重庆", "南京", "天津", "苏州", "西安", "长沙", "沈阳",
                "青岛", "郑州", "大连", "宁波", "厦门", "福州", "无锡", "合肥", "昆明", "哈尔滨", "济南", "佛山", "长春", "温州"};

        networkPresenter.getData(cities);
    }


    @Override
    public void setData(WeatherEntry weatherEntry) {
        textView.setText(weatherEntry.toString());
    }

    @Override
    public void dataError(Throwable e) {
        Toast.makeText(this,"加载失败...",Toast.LENGTH_LONG).show();
    }
}
