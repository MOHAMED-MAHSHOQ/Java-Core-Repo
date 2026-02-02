package com.mahshoq.exceptionHandling;

public class DivideByZeroV2 {
    public static void main(String[] args) throws ArithmeticException {
        int a=10;
        int b=0;


        int c=a/b;
//        try {
//            int c=10/0;
//        } catch (ArithmeticException e) {
//            System.out.println("Catched   :"+e);
//        }

        System.out.println("Code Ended");
    }
}
