package com.yeyouluo;

/**
 * 抽象中介者类
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Mediator {
    public abstract void send(Colleague from, String msg);
}

class ConcreteMediator extends Mediator{
    // 需要了解所有的具体同事对象
    private ConcreteColleagueA ca;
    private ConcreteColleagueB cb;

    @Override
    public void send(Colleague from, String msg) {
        // 根据对象做出选择判断，通知对象
        if( from == ca ) {
            cb.recieveMsg(msg);
        }else {
            ca.recieveMsg(msg);
        }
    }

    public ConcreteColleagueA getCa() {
        return ca;
    }

    public void setCa(ConcreteColleagueA ca) {
        this.ca = ca;
    }

    public ConcreteColleagueB getCb() {
        return cb;
    }

    public void setCb(ConcreteColleagueB cb) {
        this.cb = cb;
    }
}
