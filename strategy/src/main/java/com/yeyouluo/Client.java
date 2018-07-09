package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcretStratrgyB();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
