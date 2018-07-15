package com.yeyouluo;

/**
 * 具体
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Implementor {
    public abstract void operate();
}

class ConcreteImplementorA extends Implementor {

    @Override
    public void operate() {
        System.out.println("具体实现A的执行方法");
    }
}


class ConcreteImplementorB extends Implementor {

    @Override
    public void operate() {
        System.out.println("具体实现B的执行方法");
    }
}