    package com.mahshoq.cloneClasses;

    import java.sql.SQLOutput;

    public class Student implements Cloneable{
        int studId;
        String studName;
        Department d ;
        Student(int studId,String studName,Department d){
            this.studId=studId;
            this.studName=studName;
            this.d =d;

        }

//        @Override
//        //SHALLOW CLONING CLONES ONLY THE DETAILS OF THIS CLASS WE NEED DEEP CLONE OF DEPARTMENT BECAUSE ITS MUTABLE
//        protected Object clone() throws CloneNotSupportedException {
//            return super.clone();
//        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            Student s = (Student) super.clone();
            s.d = (Department) s.d.clone();
            return s;
        }

        public void display(){
            System.out.println(studId+" "+studName+" "+d.toString());
        }
    }
