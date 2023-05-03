package java6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {

        try {
            FileReader fin = new FileReader("C:\\Users\\rntll\\Desktop\\KJY\\코딩\\JAVA\\JAVA-Practice\\src\\main\\java\\java6\\1.txt");

            int c;
            while((c = fin.read()) != -1) {     //한 문자씩 파일 끝까지
                System.out.print((char) c);
            }

            fin.close();

        }
        catch (FileNotFoundException e) {
            System.out.printf("파일을 열 수 없음");
        }
        catch (IOException e) {
            System.out.printf("입출력 오류");
        }
    }
}
