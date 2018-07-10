package com.yeyouluo;

import com.yeyouluo.entity.Operation;

/**
 * Author: yeyouluo
 * Date: 2018/7/10
 */
public class Client {
    public static void main(String[] args) {
        OperationFactory factory = new DivFactory();
        Operation operation = factory.createOperation();

        operation.setNumberA(100);
        operation.setNumberB(20);

        System.out.println(operation.getResult());
    }
}
