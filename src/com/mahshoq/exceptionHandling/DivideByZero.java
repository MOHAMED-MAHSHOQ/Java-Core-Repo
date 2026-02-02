package com.mahshoq.exceptionHandling;

public class DivideByZero {
    public static void main(String[] args) {
        int a =5;
        int b=0;

        try{
            int c=a/b;//Unchecked Exception nt shown by the compiler
        }
        catch (Exception e){
            e.printStackTrace();//print the error
        }
        finally {
            System.out.println("Fiannlyy Ha!!");
        }
        System.out.println("Code Ended");
    }
}
