package com.yeyouluo.guava.event;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/11
 */
public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new MyEvent());//注册事件
        eventBus.post("触发事件，哈哈哈");// 触发事件处理
    }
}
