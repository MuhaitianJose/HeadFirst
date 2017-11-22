package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class NoQuarterState implements State {
    private final String TAG = NoQuarterState.class.getSimpleName();
    GumballMachineState gumballMachineState;

    public NoQuarterState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        Log.d(TAG, "You inserted a quarter ");
        gumballMachineState.setState(gumballMachineState.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        Log.d(TAG, "You haven't inserted a quarter ");
    }

    @Override
    public void turnCrank() {
        Log.d(TAG, "You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        Log.d(TAG, "You need to pay first");
    }
}
