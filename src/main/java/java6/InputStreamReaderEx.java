package java6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderEx {

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\rntll\\Desktop\\KJY\\코딩\\JAVA\\JAVA-Practice\\src\\main\\java\\java6\\1.txt");
            InputStreamReader in = new InputStreamReader(fin, StandardCharsets.UTF_8);
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while((c = fin.read()) != -1) {     //한 문자씩 파일 끝까지
                System.out.print((char) c);
            }
            in.close();
            fin.close();

        }
        catch (IOException e) {
            System.out.printf("입출력 오류");
        }
    }
}
