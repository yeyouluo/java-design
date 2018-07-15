package com.yeyouluo;

/**
 * 组合中的对象声明接口，用于访问和管理Component的子部件
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
