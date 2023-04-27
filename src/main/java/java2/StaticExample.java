package java2;

class StaticSample {
    public int n;
    public void g() {
        m = 20;
    }
    public void h() {
        m = 30;
    }
    public static int m = -1;   //해당 클래스로 만들어진 모든 인스턴스에 공유됨
    public static void f() {   
        m = 5;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        StaticSample s1, s2;
        s1 = new StaticSample();
        System.out.printf("\n"+s1.m);
        s2 = new StaticSample();
        s2.h();
        System.out.printf("\n"+s1.m);
        s2.f();
        System.out.printf("\n"+s1.m);
        StaticSample.m = -1;    //인스턴스없이 호출도 가능
        System.out.printf("\n"+s1.m);
        StaticSample.f();       //메소드도 인스턴스없이 호출 가능
        System.out.printf("\n"+s1.m);
    }   //static 메소드는 static 멤버만 접근 가능 + static 메소드는 this 사용 불가
}
