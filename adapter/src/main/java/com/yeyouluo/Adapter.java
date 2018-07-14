package com.yeyouluo;

/**
 * 适配器，目标是将adaptee适配成target
 * @Auther: yeyouluo
 * @Date: 2018/7/14
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 表面调用request()，实际调用specificRequest()，达到适配目的。
        adaptee.specificRequest();
    }
}
