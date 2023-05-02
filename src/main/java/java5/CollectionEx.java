package java5;

import java.util.Vector;

public class CollectionEx {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();

        Vector<String> str;
        str = new Vector<String>();

        v.add(Integer.valueOf(5));
        v.add(4);
        v.add(null);    //벡터v에 삽입

        v.add(2, 100);  //벡터v의 인덱스2에 100을 삽입

        Integer obj = v.get(1);
        int i = obj.intValue();     // 요소를 알아낼 때 언박싱을 하면 이런 식

        i = v.get(1);   //자동 언박싱 가능

        int len = v.size();     //벡터의 크기, 요소의 수
        int cap = v.capacity();     //벡터의 용량

        v.remove(1);        //인덱스 1의 위치에 있는 요소 삭제, 뒤에 있는거 하나씩 땡겨옴

        v.indexOf(100);     //값과 같은 첫번째 요소의 인덱스 리턴턴

       Integer m = 100;
        v.remove(m);        //인덱스100이 아닌 레퍼런스 값이 100인 것 삭제


        v.removeAllElements();      //전삭

    }
}
