package com.cagri.designpatterns.strategy.behaviours.fly;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Fly with Wings");
    }
}
