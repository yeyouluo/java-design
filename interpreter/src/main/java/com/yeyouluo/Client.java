package com.yeyouluo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/16
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list =  new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for( AbstractExpression exp : list ) {
            exp.interpret(context);
        }
    }
}
