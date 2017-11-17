package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class PopcornPopper {
    private final String TAG = PopcornPopper.class.getSimpleName();
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }


    public String toString() {
        return description;
    }
}
