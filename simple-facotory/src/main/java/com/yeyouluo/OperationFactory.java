package com.yeyouluo;

import com.sun.istack.internal.NotNull;
import com.yeyouluo.entity.*;

/**
 * Author: yeyouluo
 * Date: 2018/7/9
 */
public class OperationFactory {
    public static Operation createOperate(@NotNull String operate) {
        Operation opr = null;

        switch ( operate ) {
            case "+": opr = new OperationAdd(); break;
            case "-": opr = new OperationSub(); break;
            case "*": opr = new OperationMul(); break;
            case "/": opr = new OperationDiv(); break;
        }

        return opr;
    }
}
