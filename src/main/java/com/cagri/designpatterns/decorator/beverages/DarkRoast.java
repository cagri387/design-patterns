package com.cagri.designpatterns.decorator.beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
