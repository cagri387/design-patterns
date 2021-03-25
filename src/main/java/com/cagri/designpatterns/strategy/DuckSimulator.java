package com.cagri.designpatterns.strategy;

import com.cagri.designpatterns.strategy.behaviours.fly.FlyWithWings;
import com.cagri.designpatterns.strategy.behaviours.quack.Quack;
import com.cagri.designpatterns.strategy.duck.Duck;
import com.cagri.designpatterns.strategy.duck.MallardDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new Quack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
