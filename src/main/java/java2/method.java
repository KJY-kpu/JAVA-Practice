package java2;

class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }

}

public class method {

    static void plus(Number number) {
        number.num++;
    }
    static void plus(int n) {
        n++;
    }
    static void plus(int [] arr) {
        arr[0]++;
    }

    public static void main(String[] args) {
        Number number = new Number(5);
        int n = 5;
        int arr [] = {5};
        plus(arr);      //배열은 레퍼런스로 인자가 넘어가서 원본 값이 바뀜
        plus(n);        //기본타입 변수는 복사값이 넘어가서 원본이 바뀌지 않음
        plus(number);   //객체는 레퍼런스로 인자가 넘어가서 원본 값이 바뀜
        System.out.printf("number : " + number.num + "\nn :" + n + "\narr[0] : " + arr[0]);
    }
}

