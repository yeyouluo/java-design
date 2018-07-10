package com.yeyouluo.entity;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class OperationAdd extends Operation{

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
