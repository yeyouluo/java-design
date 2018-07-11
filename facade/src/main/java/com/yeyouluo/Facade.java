package com.yeyouluo;

import com.yeyouluo.entity.SubSystemFour;
import com.yeyouluo.entity.SubSystemOne;
import com.yeyouluo.entity.SubSystemThree;
import com.yeyouluo.entity.SubSystemTwo;

/**
 * Author: yeyouluo
 * Date: 2018/7/11
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour =  new SubSystemFour();
    }

    public void methodA(){
        System.out.println("\n方法组A:---------------");
        subSystemOne.methodOne();
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }

    public void methodB(){
        System.out.println("\n方法组B:---------------");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
