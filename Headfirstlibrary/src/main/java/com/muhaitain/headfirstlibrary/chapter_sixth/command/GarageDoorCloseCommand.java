package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.GarageDoor;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class GarageDoorCloseCommand implements ICommand {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        if (garageDoor != null) {
            garageDoor.down();
            garageDoor.lightOff();
            garageDoor.stop();
        }
    }

    @Override
    public void undo() {
        if (garageDoor != null) {
            garageDoor.up();
            garageDoor.lightOn();
        }
    }
}
