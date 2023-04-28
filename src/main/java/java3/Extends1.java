package java3;

class Point {
    private int x, y;
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {       //점의 좌표 출력
        System.out.printf("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {        //Point를 상속받는 클래스
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {      //컬러 점의 좌표 출력
        System.out.printf(color);
        super.showPoint();              //ColorPoint의 showPoint() 함수가 아닌 슈퍼 클래스의 메소드를 호출
    }
    public void showPoint() {
        System.out.printf("\nthis is not");
    }
}

public class Extends1 {

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint();
        cp.set(1,2);
        cp.setColor("Red");
        cp.showColorPoint();
    }
}
