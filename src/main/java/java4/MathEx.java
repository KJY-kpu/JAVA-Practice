package java4;

public class MathEx {
    public static void main(String[] args) {
        double d = 3.14;
        double d2 = 3.1;
        System.out.println(Math.abs(d));    //절대값
        System.out.println(Math.ceil(d));   //올림
        System.out.println(Math.floor(d));  //내림
        System.out.println(Math.max(d, d2));    //큰거
        System.out.println(Math.min(d, d2));    //작은거
        System.out.println(Math.random());      //0.0보다 크고 1.0보다 작은 임의의 실수 리턴
        System.out.println(Math.round(d));      //반올림
    }
}
