package com.mahshoq.multiThreading;

public class RetriveDatabase implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Data "+i+" fetched in database");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
