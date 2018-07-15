package com.yeyouluo;

/**
 * 聚集类
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public abstract class Aggregate<T> {
    /**
     * 创建迭代器
     * @return
     */
    public abstract Iterator<T> createIterator();

    /**
     * 创建倒序迭代器
     * @return
     */
    public abstract Iterator<T> createIteratorDesc();
}
