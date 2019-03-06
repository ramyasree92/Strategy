package com.pattern;

public class FlyInjured implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I am injured!!! I can't fly");
    }
}
