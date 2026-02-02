package com.mahshoq.abstractClasses;

public class Teacher extends Member{

    Teacher(){
        this.display();
    }

    @Override
    void display() {
        System.out.println("Welcome Teacher...!");
    }
}
