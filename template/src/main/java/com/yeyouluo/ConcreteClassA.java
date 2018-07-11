package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class ConcreteClassA extends TemplateClass {
    @Override
    public void primitiveOperationA() {
        System.out.println("primitiveOperationA in ConcreteClassA");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("primitiveOperationB in ConcreteClassA");
    }
}
