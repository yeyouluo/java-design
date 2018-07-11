package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
