package com.bupt.testapp.module.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
import com.bupt.testapp.module.network.NetworkActivity;
import com.bupt.testapp.module.touchevent.TouchActivity;

import butterknife.BindView;
import butterknife.OnClick;

/*
* @author Jerry
* create at 2019/4/11 下午9:02
* description:主界面
*/

public class HomeActivity extends BaseActivity {

    @BindView(R.id.but_1)
    Button but_to_touchActivity;
    @BindView(R.id.but_2)
    Button but_to_networkActivity;

    @Override
    protected int getContentViewLayoutID() {//获取界面布局ID
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @OnClick(R.id.but_1)
    public void onClick_but1(){
        Intent intent = new Intent(this, TouchActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.but_2)
    public void onClick_but2(){
        Intent intent = new Intent(this, NetworkActivity.class);
        startActivity(intent);
    }
}
