package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.Stereo;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class StereoOnWithCDCommand implements ICommand {
    private final String TAG = StereoOnWithCDCommand.class.getSimpleName();
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        if (stereo != null) {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(12);
        }
    }

    @Override
    public void undo() {

    }
}
