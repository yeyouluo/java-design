package com.yeyouluo;

/**
 * 抽象同事类
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMsg(String msg){
        mediator.send(this, msg );
    }
    public void recieveMsg(String msg){
        System.out.println(this.getClass().getName() + "收到消息：" + msg);
    }
}

class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }
}

class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
}
