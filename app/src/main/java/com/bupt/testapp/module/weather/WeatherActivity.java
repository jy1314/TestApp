package com.bupt.testapp.module.weather;

import android.os.Bundle;

import com.bupt.testapp.Base.BaseActivity;
import com.bupt.testapp.R;
import com.bupt.testapp.entry.WeatherEntry;
import com.loopeer.cardstack.CardStackView;

import java.util.List;

import butterknife.BindView;

public class WeatherActivity extends BaseActivity implements CardStackView.ItemExpendListener, WeatherContract.View {

    @BindView(R.id.weather_stackview)
    CardStackView weather_cardstackview;



    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_weather;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    public void setData(List<WeatherEntry> weatherEntities) {

    }

    @Override
    public void dataError(Throwable e) {

    }

    @Override
    public void onItemExpend(boolean expend) {

    }
}
