package com.demo.bean;

public class Emp {
    private String name;
    private String id;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void add(){
        System.out.println(name + "::" + id + "::" + dept);
    }
}
