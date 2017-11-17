package com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore;

import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.Pizza;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public abstract class PizzaStore {

//    SimplePizzaFactory simplePizzaFactory;
//
//    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
//        this.simplePizzaFactory = simplePizzaFactory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
