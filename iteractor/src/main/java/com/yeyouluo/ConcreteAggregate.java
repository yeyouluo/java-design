package com.yeyouluo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class ConcreteAggregate<T> extends Aggregate<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }

    @Override
    public Iterator<T> createIteratorDesc() {
        return new ConcreteIteratorDesc<>(this);
    }

    public int count(){
        return items.size();
    }

    public T getItem( int index ) {
        return items.get(index);
    }

    public void setItems(List<T> items) {
        this.items.addAll(items);
    }

    public void setItem(T item) {
        this.items.add(item);
    }
}
