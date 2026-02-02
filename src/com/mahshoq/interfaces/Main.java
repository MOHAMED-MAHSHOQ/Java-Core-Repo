package com.mahshoq.interfaces;

public class Main {
    public static void main(String[] args) {

//        interface1 i1obj = new class2();
//        i1obj.defaultMethodInterface1();

        interface2 i2obj = new class3();
        i2obj.defaultMethodInterface2();
        int a=interface2.num;
        System.out.println("iam interface 1's variable accessed by i'2 becoz interface 2 extends interface i1 so get access to all stuffs in the i1 + i2 stuffs like definterface2 method i accessing using ref obj of type interface i2 it sees haa iam referencing to i2 so i can access values in i2 that are overridden by class3(only common objects of i2 in class3 but the overridden )  with help of dynamic method dispatch in runtime           \n"+a);
    }
}
