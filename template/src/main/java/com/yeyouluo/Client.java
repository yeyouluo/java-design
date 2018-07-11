package com.yeyouluo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass;

        templateClass = new ConcreteClassA();
        templateClass.templateFunc();

        System.out.println("\n=========================");
        templateClass = new ConcreteClassB();
        templateClass.templateFunc();
    }
}
