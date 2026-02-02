package com.mahshoq.comparable_Interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeAbstract emp1 = new Employee1(1,19,"Mahshoq",1);

        emp1.ReqMyPosition();
        EmployeeAbstract emp2 = new Employee1(2,23,"Siddiq",3);
        emp2.ReqMyPosition();




        EmployeeAbstract emp3 = new Employee1(3,20,"Azif",0);
        EmployeeAbstract emp4 = new Employee1(4,19,"Irfan",2);
        EmployeeAbstract emp5 = new Employee1(5,22,"Ansar",2);
        EmployeeAbstract emp6 = new Employee1(6,21,"Sharik",1);


        EmployeeAbstract[] m = {emp1,emp2,emp3,emp4,emp5,emp6};
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));


    }
}
