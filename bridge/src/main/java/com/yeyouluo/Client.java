package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor( new ConcreteImplementorA() );
        abstraction.handle();

        abstraction.setImplementor( new ConcreteImplementorB() );
        abstraction.handle();
    }
}
