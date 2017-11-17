package com.muhaitain.headfirstlibrary.chapter_sixth.command;

import com.muhaitain.headfirstlibrary.chapter_sixth.model.Light;

/**
 * Created by Muhaitian on 2017/11/16.
 * 实现命令对象
 */

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light != null) {
            light.on();
        }
    }

    @Override
    public void undo() {
        if (light != null) {
            light.off();
        }
    }
}
