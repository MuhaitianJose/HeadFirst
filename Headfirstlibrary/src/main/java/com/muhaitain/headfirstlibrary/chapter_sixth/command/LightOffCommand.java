package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.Light;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.off();
        }
    }

    @Override
    public void undo() {
        if (light != null) {
            light.on();
        }
    }
}
