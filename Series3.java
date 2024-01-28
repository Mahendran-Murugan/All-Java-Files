package Coding;

import java.util.Scanner;

public class Series3 {
    public static void main (String[] args) {
        int n, st = 0, stAd = 3;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(st + " ");
            st += stAd;
            stAd += 2;
        }
    }
}
