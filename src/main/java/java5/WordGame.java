package java5;

import java.util.Scanner;
import java.util.Vector;

class Word {
    String eng;
    String kor;
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
}

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Word> v = new Vector<>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("book", "책"));
        v.add(new Word("spring", "봄"));
        v.add(new Word("maple", "단풍"));
        v.add(new Word("cup", "컵"));

        int select = 0;
        System.out.println("단어테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 "+ v.size() + "개의 단어가 들어있습니다.");
        while(select != -1) {
            int rand = (int) (Math.random() * 10) % v.size();
            int correct = (int) (Math.random() * 10) % 4;
            Word temp = v.get(rand);
            Vector<String> duplicate = new Vector<>();
            duplicate.add(temp.kor);
            System.out.println(temp.eng + " ? ");
            for(int i = 0; i < 4; i++) {
                rand = (int) (Math.random() * 10) % v.size();

                if(i == correct) System.out.printf(i+1 + ")" + temp.kor);
                else if(!duplicate.contains(v.get(rand).kor))  {
                    System.out.print(i+1 + ")" + v.get(rand).kor);
                    duplicate.add(v.get(rand).kor);
                }
                else i--;
            }
            System.out.print(" :  ");
            select = sc.nextInt();
            if(select-1 == correct) System.out.println("Excellent ! !");
            else if(select == -1) System.out.print("영어 맞추기를 종료합니다.");
            else System.out.println("NO !!");

        }

    }
}
