package com.muhaitain.headfirstlibrary.chapter_sixth.command;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public interface ICommand {
    public void execute();
    public void undo();
}
