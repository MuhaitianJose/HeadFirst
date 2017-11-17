package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.CeilingFan;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class CeilingFanHighCommand implements ICommand {
    CeilingFan ceilingFan;
    private int prevSpeed;

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }

    }
}
