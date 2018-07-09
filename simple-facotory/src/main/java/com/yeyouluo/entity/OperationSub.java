package com.yeyouluo.entity;

import com.yeyouluo.entity.Operation;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
