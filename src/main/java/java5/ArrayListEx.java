package java5;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        //ArrayList : 벡터 클래스와 거의 동일, 스레드 간 동기화 지원되지 않아 다수 스레드 환경에서 훼손 우려 있음. 하지만 단일 스레드에서 벡터보다 빠름

        ArrayList<String> a = new ArrayList<>();

        a.add("Hello");
        a.add("hi");
        System.out.printf(a.get(0));

        int len = a.size();

        a.clear();      //모든요소 삭제
    }
}
