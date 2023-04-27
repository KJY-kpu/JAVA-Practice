package java2;

final class FinalClass {    //이 클래스는 상속 불가

}

/*class SubClass extends FinalClass {     //fibal 클래스이기에 오류 발생

}*/

class A {
    public static final int ROWS = 10;  //public에 static 선언 시 프로그램 어디서든 사용가능한 ROWS 상수가 됨

    final int aa() {
        return 1;
    }
}

class B extends A {
    /*int aa() {      //부모 클래스의 aa메소드가 final이기에 오류 발생
        return 1;
    }*/
}

public class FinalExample {
    public static void main(String[] args) {
        final double PI = 3.14;
        //PI = 5.2;   //PI가 final 필드 선언이기에 변경 불가
    }
}
