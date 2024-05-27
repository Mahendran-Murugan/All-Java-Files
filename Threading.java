public class Threading extends Thread {

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
        Threading t1 = new Threading();
        Threading t2 = new Threading();
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
