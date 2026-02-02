package com.mahshoq.wrapperClass;

public class Main {
    public static void main(String[] args) {
        int a =10;//primitive

        Integer b = Integer.valueOf(a);//BOXING!!!   Integer wrap int the valueof returns Integer obj
        int c=b.intValue(); // UNBOXING!!!  Object converted to iny

        Integer d = 20; // Autoboxing!!!
        int e=d; //AUTO-UNBOXING!!!

        String s="123";
        int x = Integer.parseInt(s);//What the need of wrapping and making Integer Objects ----> To have wide access to methods becoz class has many methods accessed using object
        System.out.println(x);

    }
}
