package com.cagri.designpatterns.strategy.duck;

import com.cagri.designpatterns.strategy.behaviours.fly.FlyBehaviour;
import com.cagri.designpatterns.strategy.behaviours.quack.QuackBehaviour;
import lombok.Setter;

@Setter
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
