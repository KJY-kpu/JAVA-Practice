package java5;

class MyClass<T> {      //매개 변수 T는 클래스 객체 생성 시 결정됨
    T val;
    void set(T a) {
        val = a;
    }
    T get() {
        return val;
    }
}

public class GenericClassEx {
    public static void main(String[] args) {

        MyClass<String> mt = new MyClass<>();       //<T> 를 String으로 구체화화
       mt.set("hello");
        System.out.println(mt.get());

        MyClass<Integer> mt2 = new MyClass<>();
        mt2.set(2);
        System.out.println(mt2.get());

    }


}
