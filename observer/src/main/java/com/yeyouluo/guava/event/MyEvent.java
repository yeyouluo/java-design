package com.yeyouluo.guava.event;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/11
 */
public class MyEvent {

    @Subscribe
    public void sub(String message) {
        System.out.println(message);
    }
}
