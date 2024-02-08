
import java.util.Scanner;

public class PriceDiscount {
    public static void main (String[] args) {
        int month;
        double rate, disPrice = 0;
        Scanner in = new Scanner(System. in) ;
        rate = in.nextDouble();
        month = in.nextInt();
        switch (month){
            case 1:
                disPrice = rate * 0.20;
                break;
            case 3:
                disPrice = rate * 0.10;
                break;
            case 6:
            case 7:
                disPrice = rate * 0.75;
                break;
            case 10:
            case 11:
                disPrice = rate * 0.30;
                break;
            case 12:
                disPrice = rate * 0.35;
                break;
        }
            System.out.printf("Chris father needs to pay Rs.%.2f", (rate - disPrice));
    }
}