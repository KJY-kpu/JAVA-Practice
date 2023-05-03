package java7;

import static java.lang.Thread.sleep;

class TimeThread3 extends Thread {
    int n = 0;
    ForAdd fa;
    public boolean flag = false;

    public void finish() { flag = true;}

    @Override       //Threa 클래스의 run을 오버라이딩 해야함.
    public void run() {
        fa.add(n);
    }

}

class TimeThread4 extends Thread {
    int n = 100;
    ForAdd fa;
    @Override
    public void run() {
        fa.add(n);
    }

}

class ForAdd {

    synchronized public void add(int n) {        //synchronized로 메소드를 임계 영역으로 지정하여, th 쓰레드가 add의 사용을 종료할때까지 th2는 대기함
        while (true) {
            System.out.println(n);
            n++;
            try {
                sleep(1000);
                if(n % 10 == 0)  {
                    notify();       //대기중인 스레드 중 한개의 스레드를 RUNNABLE 상태로 만듦
                    wait();         //다른 스레드가 이 객체의 notify()를 호출할때까지 현재 점유중인 스레드는 대기
                    //notifyAll();      //대기중인 모든 스레드를 RUNNABLE 상태로 만듦
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


public class SynchronizedEx {
    public static void main(String[] args) {

        ForAdd fa = new ForAdd();

        TimeThread3 th = new TimeThread3();
        th.fa = fa;

        TimeThread4 th2 = new TimeThread4();
        th2.fa = fa;

        th.start();     //스레드 객체를 스케쥴링이 가능한 상태로 전환,이후 JVM에 의해 run() 메소드 호출
        th2.start();


    }


}
