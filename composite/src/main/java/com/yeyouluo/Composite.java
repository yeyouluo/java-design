package com.yeyouluo;

import com.yeyouluo.util.MyStringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义有枝节点行为，用来存储子部件
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(MyStringUtils.repeatableString("-" , depth) + this.name);

        for( Component c : children ) {
            c.display(depth + 2);
        }
    }
}
