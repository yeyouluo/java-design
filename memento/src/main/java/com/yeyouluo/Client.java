package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Client {
    public static void main(String[] args) {
        // 初始状态on
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento( originator.createMemento() );

        // 改变状态为off
        originator.setState("off");
        originator.show();

        // 恢复状态
        originator.resetMemento( caretaker.getMemento() );
        originator.show();
    }
}
