package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public abstract class TemplateClass {
    public abstract void primitiveOperationA();
    public abstract void primitiveOperationB();

    public void templateFunc(){
        System.out.println("templateFunc begin");

        primitiveOperationA();
        primitiveOperationB();

        System.out.println("templateFunc end");
    }
}
