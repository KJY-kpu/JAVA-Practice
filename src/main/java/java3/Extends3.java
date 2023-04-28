package java3;

class D {
    public D() {
        System.out.printf("D");
    }
    public D(int x) {
        System.out.printf("\nD and" + x);
    }
}

class E extends D {
    public E() {
        System.out.printf("E");
    }
    public E(int x) {
        super(x);   //매개변수 생성자인 D(int x) 호출, 이 경우 D()는 자동호출 X
        System.out.printf("\nE and" + x);
    }
}

public class Extends3 {
    public static void main(String[] args) {
        E e = new E(3);  //
    }
}
