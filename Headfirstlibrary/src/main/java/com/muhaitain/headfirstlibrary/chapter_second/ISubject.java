package com.muhaitain.headfirstlibrary.chapter_second;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public interface ISubject {
    public void registerObserver(IObserver iObserver);
    public void removeObserver(IObserver iObserver);
    public void notifyObservers();
}
