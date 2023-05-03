package java7;

public class MainThreadEx {
    public static void main(String[] args) {        //main() 메소드 또한 스레드로 존재
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        Thread.State s = Thread.currentThread().getState();



        System.out.println("현재 스레드 이름 = " + name);
        System.out.println("현재 스레드 ID = " + id);
        System.out.println("현재 스레드 우선 순위 = " + priority);
        System.out.println("현재 스레드 상태 = " + s);
    }
}
