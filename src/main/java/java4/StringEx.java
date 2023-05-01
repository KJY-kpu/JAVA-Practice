package java4;

public class StringEx {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "Hello";    //s과 s2 스트링 리터럴은 같은 테이블을 가리킴
        String a = new String("Hello");
        String a2 = new String("Hello");       //스트링 객체 a와 a2는 서로 다른 메모리에 생성됨

        a = a.concat("Java");   //concat은 문자열을 붙히는 메소드, a는 새로 리턴된 HelloJava 메모리를 가리킴, 스트링 객체는 수정이 불가.
        char c = s.charAt(0);  //문자열의 인덱스에 해당하는 문자 하나를 리턴

        String one = "A";
        String two = "B";
        int res = one.compareTo(two);   //두 문자열이 같으면 0, one이 사전적으로 먼저면 음수, 반대면 양수를 리턴
        if(res == 0) System.out.println("same");
        else if(res < 0) System.out.println(one + " < " + two);
        else System.out.println(one + " > " + two);

        String tr = "      abc   de\t";
        String tr2 = tr.trim();     //tr의 공백과 \t를 제거한 값을 tr2에 저장, 중간에 낀 공백은 제거X
        System.out.println("tr2 : " + tr2);

        String box1 = new String("C#");
        String box2 = new String(",Java");
        int n = box1.length();      //문자열의 길이

        box1.concat(box2);  //문자열 연결
        box1.replace("C#", "C++");      //문자열 대치

        String s3[] = a.split(",");     //문자열 분리, s3[0] = "C++", s3[1] = "Java"

        a = a.substring(5);     //인덱스 5부터 끝까지 리턴
        System.out.println(a);

        

    }
}
