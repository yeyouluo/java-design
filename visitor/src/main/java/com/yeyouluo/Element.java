package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/16
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}

class ConcreteElementA extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    // 其他相关方法
    public void operateA(){
        System.out.println( this.getClass().getName() + "的其他操作");
    }
}

class ConcreteElementB extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    // 其他相关方法
    public void operateB(){
        System.out.println( this.getClass().getName() + "的其他操作");
    }
}