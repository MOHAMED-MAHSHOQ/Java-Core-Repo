package com.mahshoq.multiThreading;

public class UpdateDatabase extends Thread{
     public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Data "+i+" added in database");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
