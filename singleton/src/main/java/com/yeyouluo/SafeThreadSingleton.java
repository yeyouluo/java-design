package com.yeyouluo;

/**
 * 使用双检锁实现多线程安全的单例
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class SafeThreadSingleton {

    private static SafeThreadSingleton instance;

    private SafeThreadSingleton() {

    }

    public static SafeThreadSingleton getInstance(){
        if( instance == null ) {
            synchronized ( SafeThreadSingleton.class ) {
                if( instance == null ) {
                    instance = new SafeThreadSingleton();
                }
            }
        }
        return instance;
    }

}
