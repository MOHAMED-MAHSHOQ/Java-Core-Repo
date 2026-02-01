package src.VariableLengthArgs;

public class Min {
    static int min(String str,int... val)//---> variable length int... if you have string thn (string c,int... val)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<val.length;i++){
            if(val[i]<min){
                min = val[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int a=min("array1",3,5,6,4,32,4,5,6,7,5,3,4,34,5,6,4,5,4,3);
        int b =min("array2",42,4,45,66,4,4,4,4,4);
        System.out.println(a);
        System.out.println(b);
    }
}
