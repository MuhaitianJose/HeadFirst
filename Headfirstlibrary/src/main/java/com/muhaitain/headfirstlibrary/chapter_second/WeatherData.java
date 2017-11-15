package com.muhaitain.headfirstlibrary.chapter_second;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class WeatherData implements ISubject {

    private List<IObserver> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver iObserver) {
        if (observerList != null) {
            observerList.add(iObserver);
        }
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        if (observerList != null) {
            int index = observerList.indexOf(iObserver);
            if (index >= 0) observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
