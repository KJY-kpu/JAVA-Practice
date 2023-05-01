package java4;

public class BoxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n;      //auto boxing;
        //Integer intObject = Integer.valueOf(n);       //boxing;

        int m = intObject + 10;     //auto unboxing;
        //int m = intObject.intValue() + 10;    //unboxing;
    }
}
