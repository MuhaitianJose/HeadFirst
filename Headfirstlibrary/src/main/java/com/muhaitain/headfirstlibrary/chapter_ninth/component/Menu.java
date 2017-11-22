package com.muhaitain.headfirstlibrary.chapter_ninth.component;

import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class Menu extends MenuComponent {
    private final String TAG = Menu.class.getSimpleName();
    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        Log.d(TAG, "print: " + getName() + " , " + getDescription());
        Log.d(TAG, " -------------------------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
