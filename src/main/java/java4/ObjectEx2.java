package java4;

class Point2 extends Point {
    public Point2(int x, int y) {
        super(x, y);
    }
    
    public String toString() {      //Object의 toString()을 오버라이딩
        return "Point(" + x + ", " + y + ")";
    }
}

public class ObjectEx2 {
    public static void main(String[] args) {
        Point2 p2 = new Point2(1, 2);
        System.out.println(p2.toString());
        System.out.println(p2);     //p2.toString() 으로 자동변환
    }
    
}
