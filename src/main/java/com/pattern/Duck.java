package com.pattern;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;


    Duck(){

    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void swim(){
        System.out.println("I am Swimming!!!");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
