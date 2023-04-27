package java1;

import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input score (0~100)\n");
        int score = scanner.nextInt();
        char grade;
        switch (score/10) {
            case 10 :
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            default: grade = 'F';
        }

        System.out.printf("grade = " + grade);

    }
}
