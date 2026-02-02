package com.mahshoq.cloneClasses;

public class Department implements Cloneable{
    int deptid;
    String deptName;
    Department(String name,int id){
        this.deptName=name;
        this.deptid=id;
    }

    @Override
    public String toString() {
        return this.deptid+" "+this.deptName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
