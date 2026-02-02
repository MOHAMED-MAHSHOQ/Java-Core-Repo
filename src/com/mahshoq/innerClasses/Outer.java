package com.mahshoq.innerClasses;

public class Outer {
    void display(){
        System.out.println("iam outer");
    }
    class inner {
        void display(){
            System.out.println("iam inner");
        }

    }
    static class nested{
        void display(){
            System.out.println("iam inner Static");
        }
    }
}
