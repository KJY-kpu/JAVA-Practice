package java3;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class UpCasting1 {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("KJY");
        p = s;  //업캐스팅

        System.out.printf(p.name);  //오류 없음
        //p.grade = "A"  //컴파일 오류

        Person p2 = new Student("KJY");     //업캐스팅
        Student s2;

        s = (Student)p;     //다운캐스팅 강제형변환 필수

        System.out.printf(s.name);      //오류 없음
        s.department = "CS";    //오류 없음
    }
}
