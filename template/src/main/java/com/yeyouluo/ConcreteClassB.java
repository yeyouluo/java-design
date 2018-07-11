package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class ConcreteClassB extends TemplateClass {
    @Override
    public void primitiveOperationA() {
        System.out.println("primitiveOperationA in ConcreteClassB");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("primitiveOperationB in ConcreteClassB");
    }
}