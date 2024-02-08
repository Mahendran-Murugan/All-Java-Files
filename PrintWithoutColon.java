
class A11 {
    int i = m1();
    public  int m1() {
        return 20;
    }
}

public class PrintWithoutColon {
    public static void main(String[] args) {
        A11 a = new A11();
        System.out.println(a.i);
        }
}