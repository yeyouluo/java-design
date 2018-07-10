package com.yeyouluo.entity;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult()  {
        if( getNumberB() == 0 ) {
            throw new RuntimeException("除数不能为0！");
        }
        return getNumberA() / getNumberB();
    }
}
