package java2;

import java.util.Scanner;

class Player {      //참여자의 이름을 담는 클래스
    String name;
    public Player(String name) {
        this.name = name;
    }
}

public class WordGameApp {
    static Scanner scanner = new Scanner(System.in);

    static void run() {     //게임을 실행하는 메소드

        System.out.printf("Game Start\n");
        System.out.printf("How many people? >>");
        int people = scanner.nextInt();
        int check = 1, cnt = 0;
        String word = "car";
        String nextWord;

        Player players [] = new Player[people];

        for(int i = 0; i < people; i++) {
            players[i] = new Player(getWordFromUser());
        }

        System.out.printf("First Word is " + word);

        while(check == 1) {
            System.out.printf("\n"+players[cnt].name+">>");
            nextWord = scanner.next();

            check = checkSuccess(word, nextWord);
            if(check == 0) System.out.printf(players[cnt].name+" has failed!\n");
            else word = nextWord;

            if(cnt < 2) cnt++;
            else cnt = 0;
        }

    }

    static String getWordFromUser() {       //사용자로부터 이름을 입력받는 메소드
        System.out.printf("Input name >>");
        String name = scanner.next();
        return name;
    }

    static int checkSuccess(String a, String b) {       //끝말잇기가 옳게 진행되었는지 확인하는 메소드
        char fisrtChar = b.charAt(0);
        char lastChar = a.charAt(a.length()-1);
        if(fisrtChar == lastChar) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        run();
    }
}
