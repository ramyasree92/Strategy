package com.pattern;

public class RubberDuck extends Duck {

    RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display(){
        System.out.println("I am a rubber duck");
    }
}
