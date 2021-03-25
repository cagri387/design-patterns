package com.cagri.designpatterns.strategy.behaviours.quack;

public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
