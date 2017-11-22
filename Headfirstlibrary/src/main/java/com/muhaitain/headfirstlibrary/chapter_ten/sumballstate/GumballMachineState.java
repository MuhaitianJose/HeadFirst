package com.muhaitain.headfirstlibrary.chapter_ten.sumballstate;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class GumballMachineState {
    private final String TAG = GumballMachineState.class.getSimpleName();
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;
    private String location;

    public GumballMachineState(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            state = noQuarterState;
        }
    }

    public GumballMachineState(int count, String location) {
        this(count);
        this.location = location;
    }

    public void insertQuarter() {
        if (state != null) {
            state.insertQuarter();
        }
    }

    public void ejectQuarter() {
        if (state != null) {
            state.ejectQuarter();
        }
    }

    public void turnCrank() {
        if (state != null) {
            state.turnCrank();
            state.dispense();
        }
    }

    void setState(State state) {
        this.state = state;
    }

    void reFill(int count) {
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    void releaseBall() {
        Log.d(TAG, "A gumball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }
}
