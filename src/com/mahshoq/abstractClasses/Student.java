package com.mahshoq.abstractClasses;

public class Student extends Member{

    Student(){
    this.display();
    }

    @Override
    void display() {
        System.out.println("Welcome student...!");
    }
}
