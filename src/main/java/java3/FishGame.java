package java3;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

abstract class GameObject {
    protected int distance;
    protected int x, y;
    public GameObject(int startX, int startY, int distance) {      //초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p) {      // 이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move();     //이동한 후의 새로운 위치고 x, y 변경
    protected abstract char getShape(); //객체의 모양을 타나내는 문자 리턴
}

class Bear extends GameObject{
    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    protected void move() {

    }

    protected void move(char direction) {
        switch (direction) {
            case 'a' : y = y - distance; break;
            case 's' : x = x + distance; break;
            case 'd' : x = x - distance; break;
            case 'f' : y = y + distance; break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject{
    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    protected void move() {
        Random rd = new Random();
        int i = rd.nextInt(3);
        switch (i) {
            case 0 : y = y - distance; break;
            case 1 : x = x + distance; break;
            case 2 : x = x - distance; break;
            case 3 : y = y + distance; break;
        }

    }
    protected char getShape() {
        return '@';
    }
}

class Stage {
    int x = 10;
    int y = 20;

    public void PrintField(Bear bear, Fish fish) {
        for(int i = 0; i < this.x; i++) {
            for(int j = 0; j < this.y; j++) {
                if((bear.x == i) && (bear.y == j)) {
                    System.out.printf("%c",bear.getShape());
                }
                else if((fish.x == i) && (fish.y == j)) {
                    System.out.printf("%c", fish.getShape());
                }
                else System.out.printf("-");
            }
            System.out.printf("\n");
        }
    }
}

public class FishGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char direction;
        int cnt = 0;
        Bear bear = new Bear(0, 0, 1);
        Fish fish = new Fish(5, 5, 1);
        Stage stage = new Stage();

        System.out.printf("Game Start!! \n");
        while(!bear.collide(fish)) {
            stage.PrintField(bear, fish);
            System.out.printf("Left(a), Down(s), Up(d), Right(f) >> ");
            direction = sc.next().charAt(0);
            bear.move(direction);
            if(cnt > 2) fish.move();
            if(cnt >= 4) cnt = 0;
            else cnt++;
        }
        stage.PrintField(bear, fish);
        System.out.printf("Bear Wins!!");
    }
}
