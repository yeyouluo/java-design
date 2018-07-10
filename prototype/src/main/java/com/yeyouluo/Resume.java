package com.yeyouluo;

import java.io.*;

/**
 * 简历类
 */
public class Resume implements Serializable,Cloneable {
    private static final long serialVersionUID = 728228784072296364L;

    private String name;
    private int age;
    private String gender;
    private WorkExperience workExperience;

    public Resume() {
        workExperience = new WorkExperience();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", workExperience.WorkDate=" + workExperience.getWorkDate() +
                ", workExperience.Company=" + workExperience.getCompany() +
                '}';
    }

    /**
     * 默认的clone方法是浅复制的
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深拷贝需要序列化的支持
     */
    public Object deepClone() throws IOException, ClassNotFoundException, CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
           // 将对象写入流内
           bos = new ByteArrayOutputStream();
           oos = new ObjectOutputStream(bos);
           oos.writeObject(this);


           // 从流内读出对象
           ois = new ObjectInputStream(new ByteArrayInputStream(
                   bos.toByteArray()));
       }finally {
            if (ois != null){
                ois.close();
            }
            if (oos != null) {
                oos.close();
            }
            if (bos != null) {
                bos.close();
            }
       }
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public Resume setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Resume setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Resume setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public Resume setWorkExperience(String workDate, String company) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
        return this;
    }
}
