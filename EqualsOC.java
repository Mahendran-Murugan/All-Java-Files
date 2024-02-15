
class A{
    int a, b;
}

public class EqualsOC {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1); // Different hash so not Equal
        System.out.println(a2);
        System.out.println(a1.equals(a2));
    }
}
