package com.cagri.designpatterns.decorator.decorator;

import com.cagri.designpatterns.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public abstract String getDescription();

}
