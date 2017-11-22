package com.muhaitain.headfirstlibrary.chapter_eleventh;

import android.util.Log;

import com.muhaitain.headfirstlibrary.chapter_ten.sumballstate.GumballMachineState;

/**
 * Created by Muhaitian on 2017/11/22.
 */

public class GumballMonitor {
    private final String TAG = GumballMonitor.class.getSimpleName();
    private GumballMachineState gumballMachineState;

    public GumballMonitor(GumballMachineState gumballMachineState) {
        this.gumballMachineState = gumballMachineState;
    }

    public void report(){
        Log.d(TAG, "Gumball Machine: "+gumballMachineState.getLocation());
        Log.d(TAG, "Gumball inventory: "+gumballMachineState.getCount()+" gumballs");
        Log.d(TAG, "Current State: "+gumballMachineState.getState());
    }
}
