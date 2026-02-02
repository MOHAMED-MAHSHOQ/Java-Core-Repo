package com.mahshoq.equalsOveride;

public class Employeess {
    String name;
    int salary=65000;
    Employeess(String name,int salary){
        this.name = name;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)//Employees emp=emp3 (same reference)
            return true;
        if(obj ==null)//if null then fals
            return false;
        if(this.getClass() != obj.getClass())//if both class are different thn simply waste
            return false;
        Employeess e = (Employeess) obj;//now you know both are same class so cast
        return this.name.equals(e.name) && this.salary==e.salary;
    }
}
