package com.yeyouluo;

/**
 * 为真实类和代理类提供共同的接口
 * Author: yeyouluo
 * Date: 2018/7/10
 */
public abstract class Subject {
    public abstract void request();
}

/**
 * 真实类
 */
class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("real subject request");
    }
}

