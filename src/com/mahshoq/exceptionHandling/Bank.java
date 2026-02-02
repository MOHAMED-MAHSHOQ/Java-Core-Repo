package com.mahshoq.exceptionHandling;

public class Bank {

    private int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) {
        int newamount;
        try {
            if (balance < amount)
                throw new InsufficientBalance(balance - amount);
        } catch (InsufficientBalance e) {
            e.printStackTrace();
        }
        newamount = balance - amount;
        return newamount;
    }
}





//What throws does NOT do ❌
//
//❌ It does NOT handle the exception
//
//❌ It does NOT prevent errors
//
//❌ It does NOT create an exception
//
//Why Java forces this? 🧠
//
//Because IOException is a checked exception
//Java says:
//
//“You MUST deal with this. No escape.”