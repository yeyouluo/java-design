package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        // 代码外部状态
        int extrinsicstate = 22;

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fx = factory.getFlyweight("X");
        fx.operate( --extrinsicstate );

        Flyweight fy = factory.getFlyweight("Y");
        fy.operate( --extrinsicstate );

        Flyweight fz = factory.getFlyweight("Z");
        fz.operate( --extrinsicstate );

        Flyweight fa = factory.getFlyweight("A");
        fz.operate( --extrinsicstate );

        Flyweight fx1 = factory.getFlyweight("X");
        fx1.operate( --extrinsicstate );

        UnshareConcreteFlyweight uf = new UnshareConcreteFlyweight();
        uf.operate( --extrinsicstate );

        System.out.println("==> 共享的对象共有" + factory.getSum() + "个。");
    }
}
