
/**
 * Testing3
 */
public class Testing3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Thread Created " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable t = new Testing3();
        Runnable tt = new Testing3();
        Runnable ttt = new Testing3();
        Thread t1 = new Thread(t, "Mahi");
        Thread t2 = new Thread(tt, "Mahi2");
        Thread t3 = new Thread(ttt, "Mahi3");
        t1.start();
        // t1.start();
        try {
            t1.join();
        } catch (Exception e) {

        }
        t2.start();
        t3.start();
    }
}