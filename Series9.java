package Coding;

import java.util.Scanner;

public class Series9 {
    public static void main (String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0)
                System.out.printf("%.0f ", Math.pow(i,3));
            else
                System.out.print((i*i)+" ");
        }
    }
}
