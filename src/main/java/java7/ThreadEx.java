package java7;

class TimeThread extends Thread {
    int n = 0;
    public boolean flag = false;

    public void finish() { flag = true;}

    @Override       //Threa 클래스의 run을 오버라이딩 해야함.
    public void run() {
        while(true) {
            System.out.println(n);
            n++;
            try {
                sleep(1000);
                if(flag == true) return;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class TimeThread2 extends Thread {
    int n = 100;

    @Override
    public void run() {
        while(true) {
            System.out.println(n);
            n--;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadEx {
    public static void main(String[] args) {

        TimeThread th = new TimeThread();
        TimeThread2 th2 = new TimeThread2();
        th.start();     //스레드 객체를 스케쥴링이 가능한 상태로 전환,이후 JVM에 의해 run() 메소드 호출
        th2.start();
        //th.interrupt();       //한 스레드가 다른 스레드 강제 종료, 자신을 종료하려면 return;
        th.finish();        //flag를 이용한 종료
    }
}
