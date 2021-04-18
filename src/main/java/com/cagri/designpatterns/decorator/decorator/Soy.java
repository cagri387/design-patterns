package com.cagri.designpatterns.decorator.decorator;

import com.cagri.designpatterns.decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
