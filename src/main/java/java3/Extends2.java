package java3;

class A {
    public A() {
        System.out.printf("A");
    }
}

class B extends A {
    public B() {
        System.out.printf("B");
    }
}

class C extends B {
    public C() {
        System.out.printf("C");
    }
}

public class Extends2 {
    public static void main(String[] args) {
        C c = new C();  //C -> B -> A 순으로 생성자 호출 그 후 본인 실행 따라서 A -> B -> C 순으로 생성자 실행
    }
}
