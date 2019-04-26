package com.bupt.testapp.module.weather;

import com.bupt.testapp.entry.WeatherEntry;

import java.util.List;

public interface WeatherContract {
    interface View{
        /**
         * presenter获取数据后调用此方法将数据展示到界面上
         * @param weatherEntities 获取到的天气数据
         */
        void setData(List<WeatherEntry> weatherEntities);

        /**
         * presenter获取数据失败调用此方法将错误信息展示到界面上
         * @param e
         */
        void dataError(Throwable e);
    }

    interface Presenter{
        /**
         * 从服务器获取天气数据
         */
        void getData(String[] cities);
    }

}
