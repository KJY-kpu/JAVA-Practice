package java1;

public class array1 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d", arr[i]);
        }
        System.out.printf("\n");
        int arr2[] = {1, 2, 3, 4, 5};   //크기는 자동으로 5
        for(int i = 0; i < arr2.length; i++) {
            System.out.printf("%d", arr2[i]);
        }
    }
}
