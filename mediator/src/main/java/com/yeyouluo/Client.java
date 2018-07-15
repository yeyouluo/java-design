package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        // 让两个同事类认识中介者
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        // 让中介者认识各个具体同事类对象
        mediator.setCa(colleagueA);
        mediator.setCb(colleagueB);

        // 具体同事类对象的消息发送都是通过中介者对象转发
        colleagueA.sendMsg("吃过饭了没有?");
        colleagueB.sendMsg("没有呢，你打算请客?");
    }
}
