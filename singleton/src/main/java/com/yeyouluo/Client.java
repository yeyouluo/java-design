package com.yeyouluo;

/**
 * 饿汉式单例
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if( eagerSingleton1 == eagerSingleton2 ) {
            System.out.println("两个饿汉实例相同");
        }

        System.out.println("================================");
        SatietySingleton satietySingleton1 = SatietySingleton.getInstance();
        SatietySingleton satietySingleton2 = SatietySingleton.getInstance();
        if( satietySingleton1 == satietySingleton2 ) {
            System.out.println("两个饱汉实例相同");
        }

        System.out.println("================================");
        SafeThreadSingleton safeThreadSingleton = SafeThreadSingleton.getInstance();
        for (int i = 0; i < 10 ; i++) {
            System.out.println( "var safeThreadSingleton" + i + " == safeThreadSingleton? " + ( safeThreadSingleton == SafeThreadSingleton.getInstance() ) );
        }

    }
}
