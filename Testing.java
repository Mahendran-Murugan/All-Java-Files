
/**
 * Testing
 */

import java.util.ArrayList;

class mahi {
    static int a = 10;

    static void mahieat() {
        System.out.println("Mahi");
    }
}

public class Testing {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.forEach(System.out::println);
    }
}