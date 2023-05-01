package java4;

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("a/v/s/d", "/");   //구분자로 / 를 사용해 토큰을 분리함, oracle에서는 StringBuffer 객체를 split하는 것을 권장
        
        while(st.hasMoreTokens()) {     //st에 토큰이 남아있는 동안
            System.out.println(st.nextToken());     //다음 토큰 리턴
        }
    }
}
