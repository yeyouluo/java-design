package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Iterator<T> {

    public abstract T first();

    public abstract T next();

    public abstract boolean hasNext();

    public abstract boolean isDone();

    public abstract T currentItem();
}
