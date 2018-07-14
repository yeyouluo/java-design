package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + this.state.getClass().getName());
    }
}
