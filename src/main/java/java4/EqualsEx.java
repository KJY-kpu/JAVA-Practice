package java4;

public class EqualsEx {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        if(a == b) System.out.printf("a==b");       //false, 레퍼런스를 비교하기에 서로 다름
        if(a.equals(b)) System.out.printf("a and b is Hello.");     //true  객체의 내용을 비교하기에 서로 같음, 단 String 클래스의 equals만 해당
    }
}
