package java3;

abstract class Component {      //추상 클래스 선언
    String name = "KJY";

    public abstract String getName();   //추상 메소드 선언
}

class MyComponent extends Component {
    @Override
    public String getName() {
        return name;
    }
}

public class AbstractEx {


    public static void main(String[] args) {
        MyComponent mc = new MyComponent();
        System.out.printf(mc.getName());
    }
}
