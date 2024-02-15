
class C{
    int a, b;
    @Override
    public String toString(){
        return "This is Object of A";
    }
}

public class ToStringOC {
    public static void main(String[] args) {
        C a1 = new C();
        System.out.println(a1);
    }
}
