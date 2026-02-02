package com.mahshoq.constructors_Static_Use;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main starts Class Loads");
        Box b ;//memory not allocated
        System.out.println("before Object Created Memory not Allocated for Objects Yet");
        b= new Box();//memory allocate when object created using new in heap
        System.out.println("After Object Created Memory Allocated For objects");
        Box b1 = new Box();
        Box b2 = new Box();
//        System.out.println(b.volume());
//        System.out.println(b.count);// so even though we have 3 objects the count is 1 because the count for each object is different so we need to make a common count we can do this by making count as static
          System.out.println(Box.count);//we access static variable using Class name coz it is independent of obj, but you can do with object too

        Box.display();//if you do Box. you can access all class level static stuffs
    }
}
