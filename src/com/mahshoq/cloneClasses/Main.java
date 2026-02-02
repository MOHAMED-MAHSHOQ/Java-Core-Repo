package com.mahshoq.cloneClasses;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d = new Department("CSE", 23);
        Student s1 = new Student(25, "Mahshoq", d);
        System.out.println("Original s1");
        s1.display();
        System.out.println();

        Student s2 = s1;
        System.out.println("After s2=s1");
        s1.display();
        s2.display();
        System.out.println();

        s1.studName = "mahshoqbinMaheen";
        System.out.println("After value change in s2=s1");
        s1.display();
        s2.display();
        System.out.println();

        Student s3 = (Student) s1.clone();
        System.out.println("After Cloning");
        s1.display();
        s3.display();
        System.out.println();

        s1.studName="Aiysha";
        System.out.println("Works becoz Strings are Immutable eah time you change vale creates new ");
        s1.display();
        s3.display();
        System.out.println();

        s1.d.deptName="MEch";
        System.out.println("Afterchangine dept name it affects becoz its mutable it change details in object so need deep cloning");
        System.out.println("now deepcloned");
        s1.display();//s1 department name which is of type Department points to a common object s1 & s3
        s3.display();
        System.out.println();





    }
    }
