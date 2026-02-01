package src.Constructors_Stuffs;

public class Box {
    private int l;//memory allocated for instance variable only when object created
    private int b;
    private int h;
    static int count;// so even though we have 3 objects the count is 1 because the count for each object is different so we need to make a common count we can do this by making count as static
    static {
        System.out.println("Once class Loaded i execute only once for the very first time object created and set the count to 0");
        count=0;//intialize once the class loads and allocate memory
    }

    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
        count+=1;
    }
    Box(int side){
        this.l = this.b = this.h = side;
        count+=1;
    }

    Box(int l, int b , int h){
        this.l=l;
        this.b=b;
        this.h=h;
        count+=1;
    }

    public int volume(){
        return l*b*h;
    }
    public int perimeter(){
        return l+b+h;
    }
}
