public class RunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("The Current thread is " + Thread.currentThread().getName() + " "
                        + "The current Iteration is " + i);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String[] args) {
        Threading r1 = new Threading();
        Threading r2 = new Threading();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        try {
            t1.join(5000);
            t1.setName("Hello");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        t2.start();
    }
}
