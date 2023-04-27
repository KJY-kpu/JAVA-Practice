package java1;

public class array2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int temp[] = arr;   //두 레퍼런스가 하나의 배열 공유
        temp[0] = 1;
        System.out.printf("%d", arr[0]);    //출력 : 1
    }
}
