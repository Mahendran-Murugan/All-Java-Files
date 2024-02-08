
import java.util.Scanner;

public class TheMisersDiscount {
    public static void main (String[] args) {
        double item1Price = 0.0, item2Price = 0.0, discount = 0.0, total = 0.0, disPrice = 0.0;
        Scanner in = new Scanner(System.in);
        item1Price = in.nextDouble();
        item2Price = in.nextDouble();
        discount = in.nextDouble();
        total = item1Price + item2Price;
        disPrice = total * discount / 100;
        System.out.printf("%.2f %.2f %.2f", total, total - disPrice, disPrice);
    }
}
