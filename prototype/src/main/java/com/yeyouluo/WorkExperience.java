package com.yeyouluo;

import java.io.Serializable;

/**
 * 工作经历类
 */
public class WorkExperience implements Serializable {
    private static final long serialVersionUID = 6535583295284627904L;

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
