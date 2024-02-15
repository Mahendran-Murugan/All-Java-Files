
class D{
    int a, b;
    D(){
        System.out.println("Object Created...");
    }
    @Override
    protected void finalize(){
        System.out.println("Object Destroyed...");
    }
}

public class FinalizeOC {
    public static void main(String[] args) {
        D a1 = new D();
        a1 = null; // Waste Memory Space
        D a2 = new D();
        D a3 = new D();
        a3 = a2; // Waste Memory Space
        new D(); // Waste Memory Space
        System.gc(); // Call Garbage Collector
    }
}
