package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Client {
    public static void main(String[] args) {
        // 设置初始状态为ConcreteStateA
        Context context = new Context(new ConcreteStateA());

        // 循环10次，不断请求，改变状态
        for (int i = 0; i < 10 ; i++) {
            context.request();
        }

    }
}
