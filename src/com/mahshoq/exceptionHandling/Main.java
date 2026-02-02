package com.mahshoq.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(250000);

        int remainingamount = b.withdraw(260000);
        System.out.println(remainingamount);

    }
}
