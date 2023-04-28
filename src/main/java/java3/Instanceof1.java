package java3;

class Hardware {}
class Monitor extends Hardware{}
class Mouse extends Hardware{}


public class Instanceof1 {

    static void print(Hardware h) {
        if(h instanceof Hardware) System.out.printf("HardWare");
        if(h instanceof Monitor) System.out.printf("Monitor");
        if(h instanceof Mouse) System.out.printf("Mouse");
    }

    public static void main(String[] args) {
        System.out.printf("\nnew Hardware() -> \t");  print(new Hardware());
        System.out.printf("\nnew Monitor() -> \t");  print(new Monitor());
        System.out.printf("\nnew Mouse() -> \t");  print(new Mouse());

    }
}
