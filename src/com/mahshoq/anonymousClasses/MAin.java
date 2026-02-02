package com.mahshoq.anonymousClasses;

public class MAin {
    public static void main(String[] args) {
        open o = new open();
        o.display();

        open o2 = new open(){
            @Override
            void display() {
                System.out.println("iam closed in anonymous class ha ha ha");
            }
        };
        o2.display();//anonymous class can be used in interface normally we cant create obj for interface but u can have anonymous class
    }
}
//Use anonymous classes when:
//
//class is used once
//
//logic is short
//
//you want clean, local behavior
//
//event handling / callbacks
