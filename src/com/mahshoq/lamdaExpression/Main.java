package com.mahshoq.lamdaExpression;

public class Main {
    public static void main(String[] args) {
        interface1 i1  = (a,b)-> {return a+b ;}; //lamda function can be used for interface only
        int a =i1.display(5,2);
        System.out.println(a);
    }
}
//✔ Lambda = implementation of one-method interface
//✔ Use when logic is small + local
//✔ Avoid for big logic
//✔ Streams + collections = lambda heaven