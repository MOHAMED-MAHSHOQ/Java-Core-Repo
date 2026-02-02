package com.mahshoq.exceptionHandling;

public class InsufficientBalance extends Exception{
    int diff;
    InsufficientBalance(int amt){
        this.diff=amt;
    }
}
