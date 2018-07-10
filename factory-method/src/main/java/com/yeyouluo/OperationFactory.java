package com.yeyouluo;

import com.yeyouluo.entity.*;

/**
 * Author: yeyouluo
 * Date: 2018/7/10
 */
public interface OperationFactory {
    public Operation createOperation();
}

class AddFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

class MulFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

class DivFactory implements OperationFactory{

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}