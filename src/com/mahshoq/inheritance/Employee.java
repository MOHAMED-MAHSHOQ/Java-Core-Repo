package com.mahshoq.inheritance;

import com.mahshoq.comparable_Interface.Employee1;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private double salary;
    private String name;
    private Date date;

    Employee(double salary,String name,String date){
        this.salary=salary;
        this.name=name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.date = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public double incSalary(double percent){
        return salary+=salary*(percent/100);

    }


    public void display(){
        System.out.println("Employee "+ name + " has a salary of "+ salary+ " joined on "+date);
    }
}
