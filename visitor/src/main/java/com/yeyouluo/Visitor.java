package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/16
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}

class ConcreteVisitor1 extends Visitor{

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println( concreteElementA.getClass().getName() + "被" + this.getClass().getName() + "访问。");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println( concreteElementB.getClass().getName() + "被" + this.getClass().getName() + "访问。");
    }
}

class ConcreteVisitor2 extends Visitor{

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println( concreteElementA.getClass().getName() + "被" + this.getClass().getName() + "访问。");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println( concreteElementB.getClass().getName() + "被" + this.getClass().getName() + "访问。");
    }
}