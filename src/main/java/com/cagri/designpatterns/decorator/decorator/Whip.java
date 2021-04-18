package com.cagri.designpatterns.decorator.decorator;

import com.cagri.designpatterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
