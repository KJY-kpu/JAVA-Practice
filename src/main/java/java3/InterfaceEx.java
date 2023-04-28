package java3;

interface PhoneInterface {      //인터페이스 선언
    final int TIMEOUT = 10000;  //상수 필드 선언
    void sendCall();            //추상 메소드
    void receiveCall();
    default void printLogo() {
        System.out.printf("** Phone **\n");
    }
}

class SamsungPhone implements PhoneInterface {

    @Override
    public void sendCall() {
        System.out.printf("Rrrrrrrrrrrr\n");
    }

    @Override
    public void receiveCall() {
        System.out.printf("Call Recieving...\n");
    }

    public void flash() {
        System.out.printf("Get it");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
