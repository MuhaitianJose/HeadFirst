package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
