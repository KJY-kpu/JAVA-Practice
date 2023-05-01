package java4;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");     //SitringBuffer는 가변 버퍼를 가지기에 문자열의 수정이 가능하다.
        
        sb.append(" is pencil");    //문자열 덧붙이기
        System.out.printf(sb + "\n");
        
        sb.insert(7, " my");    //"my"문자열 삽입
        System.out.printf(sb + "\n");
        
        sb.replace(8, 10, "your");  //해당 인덱스를 your로 변경
        System.out.printf(sb + "\n");
        
        sb.delete(8, 13);       //your에 해당하는 인덱스 삭제
        System.out.printf(sb + "\n");
        
        sb.setLength(4);        //스트링 버퍼 내 문자열 길이 수정 인덱스0~3까지
        System.out.printf(sb + "\n");
        System.out.println(sb.capacity());      //길이
    }
}
