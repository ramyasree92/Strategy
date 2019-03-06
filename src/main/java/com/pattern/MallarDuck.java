package com.pattern;

public class MallarDuck extends Duck {


    MallarDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
