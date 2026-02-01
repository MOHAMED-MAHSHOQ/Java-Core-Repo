package src.Interfaces;

public interface interface1 {
    //no instance in interface
    int num = 50;
    void abstractMethodInterface1();
    default void defaultMethodInterface1(){
        System.out.println("happy bipi");
    }
}
