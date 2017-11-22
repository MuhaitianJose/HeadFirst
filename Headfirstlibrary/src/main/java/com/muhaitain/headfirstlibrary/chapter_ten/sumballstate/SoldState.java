package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;


import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class SoldState implements State {
    private final String TAG = SoldState.class.getSimpleName();

    private GumballMachineState gumballMachineState;

    public SoldState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        Log.d(TAG, "Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        Log.d(TAG, "Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        Log.d(TAG, "Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachineState.releaseBall();
        if (gumballMachineState.getCount() > 0) {
            gumballMachineState.setState(gumballMachineState.getNoQuarterState());
        } else {
            Log.d(TAG, "Oops, out of gumballs");
            gumballMachineState.setState(gumballMachineState.getSoldOutState());
        }
    }
}
