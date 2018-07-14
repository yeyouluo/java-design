package com.yeyouluo;

/**
 * 备忘录，负责存储Originator对象的内部状态。
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
