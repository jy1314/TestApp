package com.bupt.testapp.module.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/*
* @author Jerry
* create at 2019/4/13 下午5:19
* description:测试用viewGroup
*/
public class MyViewGroup extends ViewGroup {

    //构造函数
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //覆写onMeasure方法，实现viewGroup的测量工作
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);//让所有子view测量自己的尺寸
        //获取测量模式和尺寸大小
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int childCount = getChildCount();//获取子view数量
        if (childCount == 0) {//如果没有子View,当前ViewGroup没有存在的意义，不用占用空间
            setMeasuredDimension(0, 0);
        } else {
            //如果宽高都是包裹内容AT_MOST即为wrap_content
            if (widthMode == MeasureSpec.AT_MOST && heightMode == MeasureSpec.AT_MOST) {
                //将高度设置为所有子View的高度相加，宽度设为子View中最大的宽度
                int height = getTotleHeight();
                int width = getMaxChildWidth();
                setMeasuredDimension(width, height);
            }
            else if (heightMode == MeasureSpec.AT_MOST) {//如果只有高度是包裹内容
                //宽度设置为ViewGroup自己的测量宽度，高度设置为所有子View的高度总和
                setMeasuredDimension(widthSize, getTotleHeight());
            }
            else if (widthMode == MeasureSpec.AT_MOST) {//如果只有宽度是包裹内容
                //宽度设置为子View中宽度最大的值，高度设置为ViewGroup自己的测量值
                setMeasuredDimension(getMaxChildWidth(), heightSize);

            }
        }

    }
    /*
     * 计算所有子view中的最大宽度
     */
    private int getMaxChildWidth() {
        int childCount = getChildCount();
        int maxWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childView = getChildAt(i);
            if (childView.getMeasuredWidth() > maxWidth)
                maxWidth = childView.getMeasuredWidth();

        }

        return maxWidth;
    }

    /*
     * 将所有子View的高度相加
     */
    private int getTotleHeight() {
        int childCount = getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            View childView = getChildAt(i);
            height += childView.getMeasuredHeight();

        }

        return height;
    }
    //覆写onLayout方法，摆放子View
    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        int count = getChildCount();
        //记录当前的高度位置
        int curHeight = i1;
        //将子View逐个摆放
        for (int l = 0; l < count; l++) {
            View child = getChildAt(l);
            int height = child.getMeasuredHeight();
            int width = child.getMeasuredWidth();
            //摆放子View，参数分别是子View矩形区域的左、上、右、下边
            child.layout(i, curHeight, i + width, curHeight + height);
            curHeight += height;
        }
    }

}
