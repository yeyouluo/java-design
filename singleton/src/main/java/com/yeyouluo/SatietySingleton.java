package com.yeyouluo;

/**
 * 饱汉式单例
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class SatietySingleton {
    private static SatietySingleton instance;

    private SatietySingleton(){

    }

    public static SatietySingleton getInstance(){
        if( instance == null ) {
            instance = new SatietySingleton();
        }
        return instance;
    }
}
