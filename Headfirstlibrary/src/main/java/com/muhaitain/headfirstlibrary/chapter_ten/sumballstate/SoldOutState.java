package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class SoldOutState implements State {
    private final String TAG = SoldOutState.class.getSimpleName();
    private GumballMachineState gumballMachineState;

    public SoldOutState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        Log.d(TAG, "You can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        Log.d(TAG, "You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        Log.d(TAG, "You turned , but there are no gumballs");
    }

    @Override
    public void dispense() {
        Log.d(TAG, "No gumball dispensed");
    }

    @Override
    public String toString() {
        return "Sold out";
    }
}
