package com.mahshoq.equalsOveride;

public class Main {
    public static void main(String[] args) {
        Employeess emp = new Employeess("Mahshoq",65000);
        Employeess emp2 = new Employeess("Mahshoq",65000);
        Managerr mana = new Managerr("Mahshoq",65000);
        Employeess emp3=emp;
//         System.out.println(emp.equals(emp2));//this uses cosmic super class Objects method then why equals works for string becoz string class overrides objects equals method
           System.out.println(emp.equals(emp3));//returns true becoz in our metho this==obj yes same ref in memory
           System.out.println(emp.equals(emp2));//now true
           System.out.println(emp.equals(mana));//returns false becoz both are different class
//         System.out.println(emp.getClass());
//         System.out.println(mana.getClass());
    }
}
