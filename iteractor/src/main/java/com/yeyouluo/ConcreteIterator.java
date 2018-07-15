package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class ConcreteIterator<T> extends Iterator<T> {

    private ConcreteAggregate<T>  concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public T first() {
        return concreteAggregate.getItem(0);
    }

    @Override
    public T next() {
        if( hasNext() ) {
            return concreteAggregate.getItem( current ++ );
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return (current < concreteAggregate.count() ) ? true : false;
    }

    @Override
    public boolean isDone() {
        return (current >= concreteAggregate.count() - 1 ) ? true : false;
    }

    @Override
    public T currentItem() {
        return concreteAggregate.getItem(current);
    }
}
