package java1;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("name input");
        String name = scanner.next();
        System.out.printf(name);

        System.out.println("\nage input");
        int age = scanner.nextInt();
        System.out.printf("\n%d", age);

        System.out.printf("\ndouble input");
        double wei = scanner.nextDouble();
        System.out.printf("\nwei = " + wei);

    }
}
