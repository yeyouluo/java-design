package com.yeyouluo;

import com.yeyouluo.entity.Operation;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("/");
        operation.setNumberA(100);
        operation.setNumberB(0);
        try {
            System.out.println(operation.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
