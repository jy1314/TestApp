package com.bupt.testapp.module.touchevent;

import android.os.Bundle;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
/*
* @author Jerry
* create at 2019/4/13 下午5:19
* description:测试ontouch原理用Activity，具体内容在布局文件中
*/
public class TouchActivity extends BaseActivity {
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_ontouch;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
