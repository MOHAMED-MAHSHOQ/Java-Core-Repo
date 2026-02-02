package com.mahshoq.multiThreadingSynchronised;

public class Database {
    int balance=1000;

   synchronized void withdraw(int amount){
        balance = balance-amount;
        System.out.println(balance);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
