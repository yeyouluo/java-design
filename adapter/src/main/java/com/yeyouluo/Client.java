package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
