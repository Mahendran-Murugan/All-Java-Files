

import java.util.Scanner;

public class ChroniclesOfNarnia {
    public static void main (String[] args) {
        int result = 0, num = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        System.out.println(result);
    }
}
