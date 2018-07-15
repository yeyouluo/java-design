package com.yeyouluo;

import java.util.Arrays;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate<String> bus = new ConcreteAggregate<>();

        bus.setItem("大鸟");
        bus.setItem("小菜");
        bus.setItems(Arrays.asList(new String[]{"行李","老外","公交内部员工","小偷"}));

//        Iterator<String> iterator = bus.createIterator();
        Iterator<String> iterator = bus.createIteratorDesc();
        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() + "  请买票！");
        }

        System.out.println("=================");
        while ( !iterator.isDone() ) {
            System.out.println( iterator.currentItem() + "  请买票！");
            iterator.next();
        }
        //
        System.out.println("=================");
        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() + "  请买票！");
        }
    }
}
