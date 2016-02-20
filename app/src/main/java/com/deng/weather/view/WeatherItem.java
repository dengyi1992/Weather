package com.deng.weather.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.deng.weather.R;

/**
 * Created by deng on 16-2-20.
 */
public class WeatherItem extends LinearLayout{

    private  TextView tvDiyTemp;
    private  TextView tvDiyDate;
    private  ImageView ivDiyIcon;

    public WeatherItem(Context context) {
        super(context);

    }
    public WeatherItem(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        View view = LayoutInflater.from(context).inflate(R.layout.weather_diy, this,true);
        ivDiyIcon = (ImageView) view.findViewById(R.id.iv_diy_icon);
        tvDiyDate = (TextView) view.findViewById(R.id.tv_diy_date);
        tvDiyTemp = (TextView) view.findViewById(R.id.tv_diy_temp);

        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.WeatherItem);
        typedArray.getText(R.styleable.WeatherItem_android_icon);

    }


}
