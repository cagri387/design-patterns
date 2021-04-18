package com.cagri.designpatterns.decorator.decorator;

import com.cagri.designpatterns.decorator.beverages.Beverage;

public class Mocka extends CondimentDecorator {

    public Mocka(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocka";
    }

    public double cost() {
       return beverage.cost() + 1.2;
    }
}
