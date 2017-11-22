package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

import android.util.Log;

import java.util.Random;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class HasQuarterState implements State {
    private final String TAG = HasQuarterState.class.getSimpleName();
    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachineState gumballMachineState;

    public HasQuarterState(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    @Override
    public void insertQuarter() {
        Log.d(TAG, " You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        Log.d(TAG, "Quarter returned");
        gumballMachineState.setState(gumballMachineState.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        Log.d(TAG, "You turned ...");
        int winner = randomWinner.nextInt(10);
        if(winner==0&&gumballMachineState.getCount()>1){
            gumballMachineState.setState(gumballMachineState.getWinnerState());
        }else {
            gumballMachineState.setState(gumballMachineState.getSoldState());
        }
    }

    @Override
    public void dispense() {
        Log.d(TAG, "No gumball dispensed");
    }
}
