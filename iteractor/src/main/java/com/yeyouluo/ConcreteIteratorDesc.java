package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class ConcreteIteratorDesc<T> extends Iterator<T> {
    private ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.count() - 1;
    }

    @Override
    public T first() {
        return aggregate.getItem( aggregate.count() - 1 );
    }

    @Override
    public T next() {
        if( hasNext() ) {
            return aggregate.getItem( current-- );
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return current >= 0 ? true : false;
    }

    @Override
    public boolean isDone() {
        return current <= 0 ? true : false;
    }

    @Override
    public T currentItem() {
        return aggregate.getItem(current);
    }
}
