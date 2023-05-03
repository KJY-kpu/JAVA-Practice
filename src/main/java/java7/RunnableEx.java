package java7;

class TimmerRunnable implements Runnable {
    int n = 0;

    @Override
    public void run () {
        while(true) {
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {return;}
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {

        Thread th = new Thread(new TimmerRunnable());       //Thread 객체의 생성자에 TimerRunnable객체를 전달
        th.start();

    }
}
