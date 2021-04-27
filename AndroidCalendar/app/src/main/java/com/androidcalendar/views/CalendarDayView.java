package com.androidcalendar.views;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidcalendar.R;
import com.androidcalendar.objects.CalendarDate;


public class CalendarDayView extends LinearLayout {

    private CalendarDate mCalendarDate;
    private TextView mTextDay;
    private View mLayoutBackground;

    public CalendarDayView(Context context, CalendarDate calendarDate) {
        super(context);
        mCalendarDate = calendarDate;
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_calendar_day, this);
        mLayoutBackground = findViewById(R.id.view_calendar_day_layout_background);
        mTextDay = (TextView) findViewById(R.id.view_calendar_day_text);
        mTextDay.setText("" + mCalendarDate.getDay());
    }

    public CalendarDate getDate() {
        return mCalendarDate;
    }

    public void setThisMothTextColor() {
        mTextDay.setTextColor(ContextCompat.getColor(getContext(), R.color.white));
    }

    public void setOtherMothTextColor() {
        mTextDay.setTextColor(ContextCompat.getColor(getContext(), R.color.grey));
    }

    public void setPurpleSolidOvalBackground() {
        mLayoutBackground.setBackgroundResource(R.drawable.oval_purple_solid);
    }

    public void setSelectDatesStype(int drawableId, int textColorId ){
        mLayoutBackground.setBackgroundResource(drawableId);
        mTextDay.setTextColor(textColorId);

    }
    public void setBackgroudResource(int backgroudId){
        mLayoutBackground.setBackgroundResource(backgroudId);
    }
    public void setBackgroudColor(int colorId){
        mLayoutBackground.setBackgroundColor(colorId);
    }
    public void setDateTextColor(int colorId){
        mTextDay.setTextColor(colorId);
    }
    public void unsetPurpleSolidOvalBackground() {
        mLayoutBackground.setBackgroundResource(R.drawable.oval_black_solid);
    }

}
