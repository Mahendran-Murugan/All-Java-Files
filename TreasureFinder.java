
import java.util.Scanner;

public class TreasureFinder {
    public static void main (String[] args) {
        int no1, no2, no3, secLargest, code;
        Scanner in = new Scanner(System.in);
        no1 = in.nextInt();
        no2 = in.nextInt();
        no3 = in.nextInt();
        secLargest = no1 >= no2 ? no1 : no2;
        secLargest = secLargest >= no3 ? no3 : secLargest;
        code = Math.min(Math.min(no1, no2), Math.min(no2, no3));
        System.out.printf("The treasure is in the box which has number %d. \nThe code to open the box is %d.",
                secLargest, code);
    }
}
