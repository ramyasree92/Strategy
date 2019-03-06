package com.pattern;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("......");
    }
}
