package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public abstract class State {
    public abstract void handle(Context context);
}


class ConcreteStateA extends State{

    @Override
    public void handle(Context context) {
        // 设置ConcreteStateA下一个状态是ConcreteStateB
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State{

    @Override
    public void handle(Context context) {
        // 设置ConcreteStateB下一个状态是ConcreteStateA，两次状态循环切换
        context.setState(new ConcreteStateA());
    }
}