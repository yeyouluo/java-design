package com.yeyouluo;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA ca = new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();

        ca.setComponent(concreteComponent);
        cb.setComponent(ca);

        cb.operate();
    }
}
