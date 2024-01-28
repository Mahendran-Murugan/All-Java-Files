package Coding;

import java.util.Scanner;

public class Series8 {
    public static void main (String[] args) {
        int n, st1 = 10, st2 = 5, i =0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n/2; i++) {
            System.out.print(st1 + " ");
            System.out.print(st2 + " ");
            st1 += 50;
            st2 += 10;
        }
        if( n %2 != 0)
            System.out.print(st1 + " ");
    }
}
