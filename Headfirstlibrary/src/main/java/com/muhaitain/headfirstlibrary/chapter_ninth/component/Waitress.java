package com.muhaitain.headfirstlibrary.chapter_ninth.component;

import java.util.Iterator;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class Waitress {
    MenuComponent allMenuComponent;

    public Waitress(MenuComponent allMenuComponent) {
        this.allMenuComponent = allMenuComponent;
    }

    public void printMenu() {
        if (allMenuComponent != null) {
            allMenuComponent.print();
        }
    }
    public void printVegetarianMenu() {
        Iterator iterator = allMenuComponent.createIterator();
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            if(component.isVegetarian()){
                component.print();
            }
        }
    }
}
