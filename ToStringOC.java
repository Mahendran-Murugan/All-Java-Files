
class A{
    int a, b;
    @Override
    public String toString(){
        return "This is Object of A";
    }
}

public class ToStringOC {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}
