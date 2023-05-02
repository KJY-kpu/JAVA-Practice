package java5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, String> h = new HashMap<>();
        h.put("apple", "Fruits");
        h.put("KJY", "Human");
        h.put("Window","OS");

        String kor = h.get("apple");
        System.out.println(kor);

        int n = h.size();       //요소 개수
        h.remove("KJY");    //해당 키에 해당하는 요소 삭제
        h.put("KJY", "Human");

        Set<String> keys = h.keySet();      //모든 요소 출력
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = h.get(keys);
            System.out.println("(" + key + ", " + value + " )");
        }
    }
}
