package com.pattern;

public class DuckSimulator {


    public static void main(String[] args){
        Duck duck1 = new MallarDuck();
        Duck duck2 = new RubberDuck();

        duck1.performFly();
        duck1.performQuack();

        duck2.performFly();
        duck2.performQuack();

        duck1.setFlyBehaviour(new FlyInjured());
        duck1.performFly();
    }
}
