package com.mahshoq.inheritance;

public class Manager extends Employee{
    private double bonus;
    Manager(double salary,String name,String date, double bonus){
        super(salary,name,date);
        this.bonus = bonus;
        this.display();

    }

    @Override
    public double getSalary() {
        double a = super.getSalary();
        return  a+=super.getSalary()+(bonus/100);
    }

    @Override
    public double incSalary(double bonus) {
        double a = super.getSalary();
        return  a+=super.getSalary()+(bonus/100);
    }

    @Override
    public void display() {
        System.out.println("Employee "+ this.getName() + " has a salary of "+ this.getSalary()+ " joined on "+this.getDate()+" with extra bonus "+this.bonus+" "+this.incSalary(bonus));
    }
}
