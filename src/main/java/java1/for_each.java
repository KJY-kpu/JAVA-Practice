package java1;

public class for_each {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};

        for (int i : n) {
            System.out.printf("%d\n", i);
        }

        String names[] = { "apple", "banana", "orange"};
        for (String s : names) {
            System.out.printf(s + "\n");
        }
    }
}
