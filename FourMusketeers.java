

import java.util.Scanner;
public class FourMusketeers {
    public static void main(String[] args) {
        double x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        System.out.printf("%.1f %.1f", ((x1 + x2 + x3) / 3), ((y1 + y2 + y3) / 3));
    }
}
