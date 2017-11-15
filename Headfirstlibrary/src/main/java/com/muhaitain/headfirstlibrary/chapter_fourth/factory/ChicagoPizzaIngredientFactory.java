package com.muhaitain.headfirstlibrary.chapter_fourth.factory;

import com.muhaitain.headfirstlibrary.chapter_fourth.material.BlackOlives;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Cheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Clams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Dough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Eggplant;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.FreshClams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.ParmesanCheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Pepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.PlumTomatoSauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Sauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.SlicedPepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Spinach;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.ThickCrustDough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Veggies;


/**
 * Created by Muhaitian on 2017/11/15.
 */

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough CreateDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce CreateSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese CreateCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Veggies[] CreateVeggies() {
        Veggies[] veggies = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni CreatePepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams CreateClam() {
        return new FreshClams();
    }
}
