package com.muhaitain.headfirstlibrary.chapter_ten.gumball;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class GumballMachine {
    private final String TAG = GumballMachine.class.getSimpleName();

    public final static int SOLD_OUT = 0;
    public final static int NO_QUARTER = 1;
    public final static int HAS_QUARTER = 2;
    public final static int SOLD = 3;
    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            Log.d(TAG, "You can't insert another quarter ");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            Log.d(TAG, "You inserted a quarter");
        } else if (state == SOLD_OUT) {
            Log.d(TAG, "You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            Log.d(TAG, "Please wait, we're already giving you a gumball");
        }
    }

    /**
     * 退回插入的钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            Log.d(TAG, "Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            Log.d(TAG, "You haven't inserted a quarter ");
        } else if (state == SOLD) {
            Log.d(TAG, "Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            Log.d(TAG, "You can't eject, you haven't inserted a quarter yet");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            Log.d(TAG, "Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            Log.d(TAG, "You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            Log.d(TAG, "You turned , but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            Log.d(TAG, "You turned...");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if (state == SOLD) {
            Log.d(TAG, "A gunball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                Log.d(TAG, "Oops,out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }else if(state==NO_QUARTER){
            Log.d(TAG, "You need to pay first");
        }else if(state==SOLD_OUT){
            Log.d(TAG, "No gumball dispensed");
        }else if(state==HAS_QUARTER){
            Log.d(TAG, "No gumball dispensed");
        }
    }
}
