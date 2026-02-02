package com.mahshoq.multiThreadingSynchronised;

public class Update implements Runnable{
    Database db;
    Update(Database db){
        this.db = db;
    }


    @Override
    public void run() {
        db.withdraw(500);

    }
}
//A stale value is an outdated value read by a thread because changes made (or in progress) by another thread are not yet visible.