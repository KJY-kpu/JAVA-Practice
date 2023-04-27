package java2;

import java.awt.font.ShapeGraphicAttribute;

public class GarbageEx {
    public static void main(String[] args) {
        String a = "Good";
        String b = "Bad";
        String c = "Normal";
        String d, e;
        a = null;   //"Good" 은 가비지가 됨
        d = c;
        c = null;   //"Normal" 은 가비지가 되지 않음. d에 의해 살아있기 때문

        System.gc();    //가비지 컬렉션 강제 요청, 즉시 작동하지는 않음. 자바 플랫폼이 판단하여 적절할 때 작동
    }
}
