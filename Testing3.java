
/**
 * Testing3
 */
public class Testing3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Created " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable t = new Testing3();
        Thread t1 = new Thread(t);
        t1.start();
    }
}