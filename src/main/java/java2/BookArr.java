package java2;

class Book {
    String title, author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArr {
    public static void main(String[] args) {
        Book [] book = new Book[2];         //클래스 배열 선언
        System.out.printf("\nnow " + book[0]);      //선언 자체로는 생성자가 안돌아감
        for(int i = 0; i < book.length; i++) {
            book[i] = new Book("KJY", "KJY");
        }
        System.out.printf("\nnow " + book[0] + " author is " + book[0].author);
    }
}
