package com.cagri.designpatterns.strategy.duck;

import com.cagri.designpatterns.strategy.behaviours.fly.FlyNoWay;
import com.cagri.designpatterns.strategy.behaviours.quack.NoQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new NoQuack());
    }

    public void display() {
        System.out.println("I'm a MallardDuck");
    }
}
