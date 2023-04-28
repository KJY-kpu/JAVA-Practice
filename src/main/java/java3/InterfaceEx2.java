package java3;

interface MP3Interface {
    void play();
    void stop();
}

interface MusicPhoneInterface extends PhoneInterface, MP3Interface {    //인터페이스 간 상속은 extends, 클래스와 다르게 다중 상속이 가능
    void playMusicPhone();
}

public class InterfaceEx2 {
}
