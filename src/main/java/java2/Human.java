package java2;

public class Human {
    String name;
    int age;
    int life;

    public Human() {
        life = 1;
    }

    public static void main(String[] args) {
        Human human1 = new Human();
        System.out.printf("life = " + human1.life);
    }
}