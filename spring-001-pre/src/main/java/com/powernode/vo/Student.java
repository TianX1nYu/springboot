package com.powernode.vo;

import org.springframework.stereotype.Component;

/**
 * packageName com.powernode.vo
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className Student
 * @date 2024/6/19
 * @description TODO
 */
@Component
public class Student {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}