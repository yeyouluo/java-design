package com.yeyouluo;

import com.yeyouluo.util.MyStringUtils;

/**
 * 叶节点对象，叶节点没有子节点
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        // 通过“-”的数目显示级别
        System.out.println(MyStringUtils.repeatableString("-" ,depth) + this.name);
    }
}
