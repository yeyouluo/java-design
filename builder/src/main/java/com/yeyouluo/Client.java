package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product builder1Result = builder1.getResult();
        builder1Result.show();


        director.construct(builder2);
        Product builder2Result = builder2.getResult();
        builder2Result.show();
    }
}
