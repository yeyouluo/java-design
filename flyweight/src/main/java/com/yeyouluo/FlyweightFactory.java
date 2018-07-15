package com.yeyouluo;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @Auther: yeyouluo
 * @Date: 2018/7/15
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyWeights = new HashMap<>();

    public FlyweightFactory() {
        // 初始化时，先生成三个实例
        this.flyWeights.put("X", new ConcreteFlyweight());
        this.flyWeights.put("Y", new ConcreteFlyweight());
        this.flyWeights.put("Z", new ConcreteFlyweight());
    }

    /**
     * 根据客户端请求，获得已生成的实例
     * @param key
     * @return
     */
    public Flyweight getFlyweight( String key ) {
        if (!flyWeights.containsKey(key)) {
            flyWeights.put(key, new ConcreteFlyweight());
        }
        return flyWeights.get(key);
    }

    public int getSum(){
        return flyWeights.size();
    }
}
