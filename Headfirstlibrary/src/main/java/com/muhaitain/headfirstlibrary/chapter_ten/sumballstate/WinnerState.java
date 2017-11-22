package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

import android.util.Log;

import java.util.Random;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class WinnerState implements State {
    private final String TAG = WinnerState.class.getSimpleName();

    private GumballMachineState gumballMachineState;

    public WinnerState(GumballMachineState gumballMachineState) {
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
        if(gumballMachineState==null){
            return;
        }
        Log.d(TAG, "YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachineState.releaseBall();
        if(gumballMachineState.getCount()==0){
            gumballMachineState.setState(gumballMachineState.getSoldOutState());
        }else {
            gumballMachineState.releaseBall();
            if(gumballMachineState.getCount()>0){
                gumballMachineState.setState(gumballMachineState.getNoQuarterState());
            }else {
                Log.d(TAG, "Oops, out of gumballs");
                gumballMachineState.setState(gumballMachineState.getSoldOutState());
            }
        }
    }
}
