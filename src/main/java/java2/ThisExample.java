package java2;

public class ThisExample {
    int a;

    public ThisExample() {
        this(4);    //오버로딩 아래 생성자를 호출
    }

    public ThisExample(int i) {
        this.a = i;
    }

    public static void main(String[] args) {
        ThisExample tE = new ThisExample();     //기본 생성자로 실행
        System.out.printf("a is " + tE.a);

        ThisExample temp;
        temp = tE;  //temp에 tE와 같은 값이 담기는 것이 아닌 같은 메모리를 가리킴

        temp.a = 10;
        System.out.printf("\na is" + tE.a);
    }
}
