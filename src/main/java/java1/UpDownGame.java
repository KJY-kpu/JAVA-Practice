package java1;

import java.util.Objects;
import java.util.Scanner;

public class UpDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ok;
        int score, cnt;
        String answer = "y";

        while(Objects.equals(answer, "y")) {
            ok = (int)(Math.random()*100);

            score = -1;
            cnt = 1;
            System.out.printf("Setting Complete! 0~100\n");
            while(score != ok) {
                System.out.printf("\n" + cnt + ">>");
                score = scanner.nextInt();
                if(score == ok) {
                    System.out.printf("\nCorrect! try again?(y/n)");
                    answer = scanner.next();
                }
                else if(score < ok) {
                    System.out.printf("\nUp!");
                }
                else {
                    System.out.printf("\nDown!");
                }
            }
        }



    }
}
