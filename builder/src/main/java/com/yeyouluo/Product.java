package com.yeyouluo;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件构成
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("--------------产品创建---------------");
        for ( String part : parts ) {
            System.out.println(part);
        }
    }
}
