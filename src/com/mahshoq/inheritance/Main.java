package com.mahshoq.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(25000.0,"mahshoq","13-01-2005");
        emp.display();
        Manager man=new Manager(20000.50,"Mahshoq MS","08-02-2025",20.2);

        Employee empman=new Manager(20000.50,"Mahshoq MS","08-02-2025",20.2);//works becoz manager is an employee

        //Store in array and create multiple objects
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(99.5,"Yogi","13-01-2024");
        employees[1] = new Employee(9999.5,"Ayisha","19-01-2024");
        employees[2] = new Employee(9900.5,"Safrin","21-01-2024");
        employees[3] = man;//this works becoz display is in manager class also done by dynamic method dispatch
        for(Employee employee:employees){
            System.out.println(employee.getName()+"     "+employee.getSalary());
        }

    }
}
