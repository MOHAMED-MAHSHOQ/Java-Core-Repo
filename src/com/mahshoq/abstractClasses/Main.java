package com.mahshoq.abstractClasses;

public class Main {
    public static void main(String[] args) {
//        Member obj = new Member();//cannot instantiate object for abstract class
        Member[] collegeMembersRecord = new Member[4];
        collegeMembersRecord[0]=new Student();//student is a member
        collegeMembersRecord[1]=new Student();
        collegeMembersRecord[2]=new Teacher();//teacher is a member
        collegeMembersRecord[3]=new Teacher();

    }
}
