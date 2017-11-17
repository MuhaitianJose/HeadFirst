package com.muhaitain.headfirstlibrary.chapter_fourth.pizza;

import com.muhaitain.headfirstlibrary.chapter_fourth.material.Cheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Clams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Dough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Pepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Sauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Veggies;

/**
 * Created by Muhaitian on 2017/11/15.
 *
 */

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
