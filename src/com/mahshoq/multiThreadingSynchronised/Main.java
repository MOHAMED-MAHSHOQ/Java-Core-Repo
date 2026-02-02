package com.mahshoq.multiThreadingSynchronised;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Update upd1 = new Update(db);//1st updation
        Update upd2 = new Update(db);//2nd Updation

        Thread t1 = new Thread(upd1);
        Thread t2 = new Thread(upd2);

        t1.start();
        t2.start();





    }
}
