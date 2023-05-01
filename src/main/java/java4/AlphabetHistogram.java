package java4;

import java.util.Scanner;

class Poem {
    StringBuffer text = new StringBuffer();
    int arr[] = new int[26];

    public Poem() {
        readString();
    }

    void readString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals(";"))        //;만 있는 라인이면 탈출
                break;
            text.append(line);      //붙이기
        }
    }

    void show() {
        int cnt = 0;
        int num;
        char a = 65;

        while (cnt<text.length()) {
            num = (int)text.charAt(cnt) <= 90 ? (int)text.charAt(cnt) - 65 : (int)text.charAt(cnt) - 97;
            arr[num]++;
            cnt++;
        }

        for(int i = 0; i < 26; i++) {

            String str = String.valueOf(a++);
            System.out.printf(str);

            for(int j = 0; j < arr[i]; j++) {
                System.out.printf("-");
            }
            System.out.printf("\n");
        }


    }
}

public class AlphabetHistogram {
    public static void main(String[] args) {
        Poem poem = new Poem();
        poem.show();
    }
}
