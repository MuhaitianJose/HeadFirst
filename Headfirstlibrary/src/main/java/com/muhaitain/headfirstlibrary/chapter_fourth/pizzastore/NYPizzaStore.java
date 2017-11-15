package com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore;

import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.Pizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.VeggiePizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.CheesePizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.ClamPizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.PepperoniPizza;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Clams")) {
            pizza = new ClamPizza();
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
