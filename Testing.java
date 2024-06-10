
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

public class Testing extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("Mahi Thread");
        System.out.println("Thread Created " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Thread Created " + Thread.currentThread().getName());

        Testing t = new Testing();
        t.start();

        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // a.add(4);
        // a.forEach(System.out::println);

        // StringBuilder s = new StringBuilder("Mahi");
        // System.out.println(s.substring(0, 3));
        // // StringBuffer s2 = new StringBuffer("Mahi");
        // // s2.setCharAt(0, 'A');
        // // System.out.println(s2);
        // // char c[] = "mahi".toCharArray();
        // // System.out.println(c);

        // System.out.println("Mahi".indexOf('M'));
        // System.out.println("MahiM".lastIndexOf('M'));
        // System.out.println("Mahi".equalsIgnoreCase("mahi"));
    }
}