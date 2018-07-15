package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();
    }
}
