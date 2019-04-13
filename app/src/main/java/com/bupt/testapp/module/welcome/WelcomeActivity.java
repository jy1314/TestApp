package com.bupt.testapp.module.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
import com.bupt.testapp.module.home.HomeActivity;


import butterknife.BindView;
import butterknife.OnClick;

/*
* @author Jerry
* create at 2019/4/11 下午9:51
* description:欢迎页面
*/


public class WelcomeActivity extends BaseActivity {
    private static final String TAG = "WelcomeActivity";

    @BindView(R.id.welcome_pic)
    ImageView mPic;//进入图片
    @BindView(R.id.jump_text)
    TextView mJump;//跳过
    @BindView(R.id.welcome_default_pic)
    ImageView mDefultPic;//默认图片

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mJump.setVisibility(View.GONE);
        mDefultPic.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.img_default_welcome));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {//延时2s切换下一张图片，并显示跳过按钮
                mDefultPic.setVisibility(View.GONE);
                mJump.setVisibility(View.VISIBLE);
            }
        }, 2000);
        mPic.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.img_default_welcome2));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    //不支持滑动退回
    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }



    /**
     * 跳转到主页面
     */
    private void toMainActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.jump_text)
    public void onClick() {
        toMainActivity();
    }



}
