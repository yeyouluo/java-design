package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
