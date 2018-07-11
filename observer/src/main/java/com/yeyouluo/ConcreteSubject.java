package com.yeyouluo;

/**
 * 具体的通知者
 *
 * @Auther: yeyouluo
 * @Date: 2018/7/11
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
