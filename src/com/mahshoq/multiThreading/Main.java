package com.mahshoq.multiThreading;

public class Main {
    public static void main(String[] args) {
        UpdateDatabase upd=new UpdateDatabase();

        RetriveDatabase ret=new RetriveDatabase();
        Thread t = new Thread(ret);


        Monitoring mon = ()->{
            for(int i=1;i<=5;i++){
                System.out.println("Done "+ i );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(mon);

        upd.start();
        upd.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        if(upd.isAlive()) System.out.println("Thread is running");

        try {
            upd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(!upd.isAlive()) System.out.println("Threads completed");
        System.out.println("bye");







    }

}
