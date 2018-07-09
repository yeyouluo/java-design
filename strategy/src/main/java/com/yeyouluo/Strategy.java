package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public interface Strategy {
    public void algorithmInterface();
}

class ConcretStratrgyA implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("策略A的具体实现！");
    }
}

class ConcretStratrgyB implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("策略B的具体实现！");
    }
}

class ConcretStratrgyC implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("策略C的具体实现！");
    }
}

