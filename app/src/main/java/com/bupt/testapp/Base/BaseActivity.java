package com.bupt.testapp.Base;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.bupt.testapp.R;
import com.jaeger.library.StatusBarUtil;

import butterknife.ButterKnife;
import cn.bingoogolapple.swipebacklayout.BGASwipeBackHelper;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/*
* @author Jerry
* create at 2019/4/11 下午7:45
* description: Activity基类，抽象类，所有Activity都应继承此类
* BGASwipeBackHelper 用于实现滑动返回，通过修改support-v4中的SlidingPaneLayout源码，实现滑动返回布局
*
*/

public abstract class BaseActivity extends AppCompatActivity implements BGASwipeBackHelper.Delegate {
    protected BGASwipeBackHelper mSwipeBackHelper;//滑动返回帮助类
    private CompositeSubscription mCompositeSubscription;//RxJava管理

    /*
     * @author: Jerry
     * @create at 2019/4/11 下午8:07
     * @Param: []
     * @description:返回布局id
     * @return: 布局id
     */
    protected abstract int getContentViewLayoutID();
    /*
     * @author: Jerry
     * @create at 2019/4/11 下午8:10
     * @Param:
     * @description: 界面初始化前期的准备
     * @return:
     */
    protected void beforeInit(){

    }
    /*
     * @author: Jerry
     * @create at 2019/4/11 下午8:10
     * @Param:
     * @description: 界面布局及view控件
     * @return:
     */
    protected abstract void initView(Bundle savedInstanceState);

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);//ButterKnife绑定Activity
    }
    //获取RxJava调度器
    public CompositeSubscription getCompositeSubscription(){
        if(this.mCompositeSubscription == null){//检查是否为空，避免空指针
            this.mCompositeSubscription = new CompositeSubscription();
        }
        return this.mCompositeSubscription;
    }
    //添加调度器
    protected void addSubscription(Subscription s){
        if(this.mCompositeSubscription == null){//检查是否为空，避免空指针
            this.mCompositeSubscription = new CompositeSubscription();
        }
        this.mCompositeSubscription.add(s);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initSupportSwipeBack();//初始化滑动返回，要在super.onCreate()前调用
        super.onCreate(savedInstanceState);
        beforeInit();//初始化
        if(getContentViewLayoutID()!=0){//获取布局id
            setContentView(getContentViewLayoutID());//加载布局
            initView(savedInstanceState);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(this.mCompositeSubscription != null && mCompositeSubscription.isUnsubscribed()){
            this.mCompositeSubscription.isUnsubscribed();
        }
    }

    /*
     * @author: Jerry
     * @create at 2019/4/11 下午8:35
     * @Param:
     * @description: 初始化滑动返回，要在super.onCreate()前调用
     * @return:
     */
    private void initSupportSwipeBack(){
        mSwipeBackHelper = new BGASwipeBackHelper(this,this);
        //设置返回是否可用默认为true
        mSwipeBackHelper.setSwipeBackEnable(true);
        //设置是否只监听左侧边缘返回，默认为true
        mSwipeBackHelper.setIsOnlyTrackingLeftEdge(true);
        //设置是微信样式，默认为true
        mSwipeBackHelper.setIsWeChatStyle(true);
        //设置阴影样式
        mSwipeBackHelper.setShadowResId(R.drawable.bga_sbl_shadow);
        //设置是否有阴影
        mSwipeBackHelper.setIsNeedShowShadow(true);
        //是否根据滑动距离变透明
        mSwipeBackHelper.setIsShadowAlphaGradient(true);
        //设置自动触发释放后返回的阈值，默认0.3f
        mSwipeBackHelper.setSwipeBackThreshold(0.3f);

    }

    //默认支持滑动返回，如果某个activity不想支持滑动返回，那么重写此方法，返回false即可。
    @Override
    public boolean isSupportSwipeBack() {
        return true;
    }
    /**
     * 正在滑动返回
     *
     * @param slideOffset 从 0 到 1
     */
    @Override
    public void onSwipeBackLayoutSlide(float slideOffset) {

    }
    /**
     * 没达到滑动返回的阈值，取消滑动返回动作，回到默认状态
     */
    @Override
    public void onSwipeBackLayoutCancel() {

    }
    /**
     * 滑动返回执行完毕，销毁当前 Activity
     */
    @Override
    public void onSwipeBackLayoutExecuted() {
        mSwipeBackHelper.swipeBackward();//滑动返回上一个 Activity，并销毁当前 Activity
    }

    @Override
    public void onBackPressed() {
        if(mSwipeBackHelper.isSliding()){//判断是否正在滑动，如果是，则不执行返回按钮的事件
            return;
        }
        mSwipeBackHelper.backward();
    }
    public void setStatusBarTransparent() {
        StatusBarUtil.setTransparent(this);
    }

    /**
     * 设置状态栏颜色
     *
     * @param color
     */
    protected void setStatusBarColor(@ColorInt int color) {
        setStatusBarColor(color, StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA);
    }

    /**
     * 设置状态栏颜色
     *
     * @param color
     * @param statusBarAlpha 透明度
     */
    public void setStatusBarColor(@ColorInt int color, @IntRange(from = 0, to = 255) int statusBarAlpha) {
        StatusBarUtil.setColorForSwipeBack(this, color, statusBarAlpha);
    }


}
