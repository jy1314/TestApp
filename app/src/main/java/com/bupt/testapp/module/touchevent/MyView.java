package com.bupt.testapp.module.touchevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/*
* @author Jerry
* create at 2019/4/13 下午3:32
* description:自定义view测试类,一个小红球，可以跟随手指移动
*/
public class MyView extends View {

    Paint paint = new Paint();//画笔
    public float currentX = 40;//x
    public float currentY = 50;//y
    int flag = 0;
    //构造函数
    public MyView(Context context){
        super(context);
    }
    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);//设置颜色
        canvas.drawCircle(currentX,currentY,15,paint);//初始位置，形状
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {//接收touchevent并处理
        currentX = event.getX();//更新x
        currentY = event.getY();//更新y
        invalidate();//重绘图形
        return true;//表明事件已被消费
    }
}
