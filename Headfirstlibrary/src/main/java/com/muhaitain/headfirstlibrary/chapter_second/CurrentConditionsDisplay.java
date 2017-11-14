package com.muhaitain.headfirstlibrary.chapter_second;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private String TAG = CurrentConditionsDisplay.class.getSimpleName();
    private float temperature;
    private float humidity;

    private WeatherData weatherData;
//    private float pressure;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
//        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        Log.d(TAG, "Current Conditions:" + temperature + "F Degrees and " + humidity + " % humidity");
    }
}
