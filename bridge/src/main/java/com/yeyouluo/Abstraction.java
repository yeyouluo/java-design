package com.yeyouluo;

/**
 * 抽象
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void handle();
}

class RefinedAbstraction extends Abstraction{

    @Override
    public void handle() {
        implementor.operate();
    }
}
