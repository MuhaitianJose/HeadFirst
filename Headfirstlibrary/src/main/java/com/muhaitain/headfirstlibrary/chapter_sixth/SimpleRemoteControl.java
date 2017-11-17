package com.muhaitain.headfirstlibrary.chapter_sixth;

import com.muhaitain.headfirstlibrary.chapter_sixth.command.ICommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.NoCommand;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class SimpleRemoteControl {
    ICommand unDoCommand;
    ICommand onCommand[];
    ICommand offCommand[];

    public SimpleRemoteControl() {
        this.onCommand = new ICommand[7];
        this.offCommand = new ICommand[7];
        ICommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        unDoCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offICommand) {
        if (onCommand != null) {
            this.onCommand[slot] = onCommand;
        }
        if (offICommand != null) {
            this.offCommand[slot] = offICommand;
        }

    }

    public void onButtonWasPressed(int slot) {
        onCommand[slot].execute();
        unDoCommand = onCommand[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommand[slot].execute();
        unDoCommand = offCommand[slot];
    }

    public void undoButtonWasPressed() {
        unDoCommand.undo();
    }
}
