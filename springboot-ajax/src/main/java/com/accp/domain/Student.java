package com.accp.domain;

import java.util.Date;

public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private Integer gradeid;

    private Date shengri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Date getShengri() {
        return shengri;
    }

    public void setShengri(Date shengri) {
        this.shengri = shengri;
    }
}