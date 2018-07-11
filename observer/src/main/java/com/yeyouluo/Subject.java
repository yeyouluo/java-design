package com.yeyouluo;

import java.util.ArrayList;
import java.util.List;


/**
 * 抽象主题
 * 提供对观察者列表的增删
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach( Observer observer ){
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach( Observer observer ) {
        observers.remove(observer);
    }

    /**
     * 遍历通知观察者更新状态
     */
    public void notifyObservers(){
        for( Observer o : observers ) {
            o.update();
        }
    }
}
