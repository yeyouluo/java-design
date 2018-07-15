package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    // 私有化构造函数
    private EagerSingleton(){

    }

    /**
     * 能够全局访问本类实例的唯一访问点
     * @return
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
