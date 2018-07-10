package com.yeyouluo;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        System.out.println("====================浅复制会改变原有对象==================");
        Resume resumeA = new Resume();
        resumeA.setName("大鸟 ").setGender("男 ").setAge(25).setWorkExperience("1999-2002, ", "XX公司");
        System.out.println("resumeA" + resumeA.toString());

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setWorkExperience("1999-2002, ", "YY公司");
        System.out.println("resumeB" + resumeB.toString());

        Resume resumeC = (Resume) resumeA.clone();
        resumeB.setWorkExperience("1999-2002, ", "ZZ公司");
        System.out.println("resumeC" + resumeC.toString());
        System.out.println("resumeA" + resumeA.toString());

        System.out.println("\n====================深复制不会改变原有对象==================");
        Resume resumeAA = new Resume();
        resumeAA.setName("大鸟 ").setGender("男 ").setAge(25).setWorkExperience("1999-2002, ", "XX公司");
        System.out.println("resumeAA" + resumeAA.toString());

        Resume resumeBB = (Resume) resumeAA.deepClone();
        resumeBB.setWorkExperience("1999-2002, ", "YY公司");
        System.out.println("resumeBB" + resumeBB.toString());

        Resume resumeCC = (Resume) resumeAA.deepClone();
        resumeCC.setWorkExperience("1999-2002, ", "ZZ公司");
        System.out.println("resumeCC" + resumeCC.toString());
        System.out.println("resumeAA" + resumeAA.toString());
    }
}
