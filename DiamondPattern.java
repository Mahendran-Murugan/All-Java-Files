import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                for (int k = n / 2; k > i; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = n / 2; k < i + 1; k++) {
                    System.out.print(" ");
                }
                for (int j = n; j > i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
