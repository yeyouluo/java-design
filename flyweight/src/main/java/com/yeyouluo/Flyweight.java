package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public interface Flyweight {
    public void operate(int extrinsicstate);
}

class ConcreteFlyweight implements Flyweight{

    @Override
    public void operate(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}

class UnshareConcreteFlyweight implements Flyweight {

    @Override
    public void operate(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight：" + extrinsicstate);
    }
}