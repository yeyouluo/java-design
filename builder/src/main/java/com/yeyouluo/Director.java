package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
