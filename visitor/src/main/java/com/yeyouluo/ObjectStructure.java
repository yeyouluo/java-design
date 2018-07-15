package com.yeyouluo;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供高层接口，允许访问者访问它的元素。
 * @Auther: yeyouluo
 * @Date: 2018/7/16
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept( Visitor visitor ) {
        for( Element e : elements ) {
            e.accept(visitor);
        }
    }
}
