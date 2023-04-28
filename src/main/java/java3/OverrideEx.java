package java3;

class Shape {
    public void draw() {
        System.out.printf("Shape\n");
    }
}

class Line extends Shape {
    @Override   //다음 오버라이딩이 정확한지 컴파일러에게 확인하도록 지시하는 어노테이션
    public void draw() {        //메소드 오버라이딩, Line의 draw 호출 시 이것이 출력됨
        System.out.printf("Line\n");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.printf("Rect\n");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.printf("Circle\n");
    }
}

public class OverrideEx {
    public static void main(String[] args) {
        Line l = new Line();

        l.draw();
    }
}
