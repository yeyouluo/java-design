package com.yeyouluo;

public class ConcreteDecoratorA extends  Decorator {

    private String addedState;

    @Override
    public void operate() {
        super.operate();
        this.addedState = "added state in ConcreteDecoratorA";
        System.out.println(this.addedState);
    }
}
