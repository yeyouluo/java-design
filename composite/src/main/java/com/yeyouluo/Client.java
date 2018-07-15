package com.yeyouluo;

/**
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class Client {
    public static void main(String[] args) {
        // 生成根节点，根节点长出两叶Leaf A和Leaf B
        Composite root = new Composite("Root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        // 根节点长出分支Composite-X，分枝上也有两叶Leaf X-A和Leaf X-B
        Composite compositeX = new Composite("Composite-X");
        compositeX.add(new Leaf("Leaf X-A"));
        compositeX.add(new Leaf("Leaf X-B"));
        root.add(compositeX);

        // 在Composite-X上再长出分支Composite-X-Y，分枝上也有两叶Leaf X-Y-A和Leaf X-Y-B
        Composite CompositeXY = new Composite("Composite-X-Y");
        CompositeXY.add(new Leaf("Leaf X-Y-A"));
        CompositeXY.add(new Leaf("Leaf X-Y-B"));
        compositeX.add(CompositeXY);

        // 根节点又长出两叶Leaf C和Leaf D。可惜Leaf D没长牢，被风吹跑了
        root.add(new Leaf("Leaf C"));

        Leaf leadD = new Leaf("Leaf D");
        root.add(leadD);
        root.remove(leadD);

        // 显示大树的样子
        root.display(1);
    }
}
