package com.cagri.designpatterns.decorator;

import com.cagri.designpatterns.decorator.beverages.Beverage;
import com.cagri.designpatterns.decorator.beverages.DarkRoast;
import com.cagri.designpatterns.decorator.beverages.Espresso;
import com.cagri.designpatterns.decorator.beverages.HouseBlend;
import com.cagri.designpatterns.decorator.decorator.Mocka;
import com.cagri.designpatterns.decorator.decorator.Soy;
import com.cagri.designpatterns.decorator.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocka(beverage2);
        beverage2 = new Mocka(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocka(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
