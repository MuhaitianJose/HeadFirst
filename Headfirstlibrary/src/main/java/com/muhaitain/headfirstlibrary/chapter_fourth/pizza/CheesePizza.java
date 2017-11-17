package com.muhaitain.headfirstlibrary.chapter_fourth.pizza;

import com.muhaitain.headfirstlibrary.chapter_fourth.factory.PizzaIngredientFactory;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Sauce;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "CheesePizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        clams = pizzaIngredientFactory.createClam();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
