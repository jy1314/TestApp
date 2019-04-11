package com.bupt.testapp.module;

import android.os.Bundle;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;

import butterknife.BindView;

/*
* @author Jerry
* create at 2019/4/11 下午9:02
* description:主界面
*/

public class HomeActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
