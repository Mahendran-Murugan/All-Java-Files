package Coding;

import java.util.Scanner;

public class Series9 {
    public static void main (String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%.0f ", Math.pow(i,i));
        }
    }
}
