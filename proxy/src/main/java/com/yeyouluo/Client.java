package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/10
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new SubjectProxy();
        subject.request();
    }
}
