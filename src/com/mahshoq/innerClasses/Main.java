package com.mahshoq.innerClasses;

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.display();

        Outer.inner oi = out.new inner();//non static!!! outer class obj need to create obj or inner class
        oi.display();

        Outer.nested on =new Outer.nested();//static!!! outer class obj not need to create obj or inner class
        on.display();
    }
}
