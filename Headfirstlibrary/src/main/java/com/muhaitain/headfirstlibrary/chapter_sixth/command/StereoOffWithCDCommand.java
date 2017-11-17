package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.Stereo;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class StereoOffWithCDCommand implements ICommand {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        if (stereo != null) {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(101);
        }
    }

    @Override
    public void undo() {

    }
}
