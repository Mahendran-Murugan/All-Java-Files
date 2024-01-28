package Coding;

import java.util.Scanner;

public class Series4 {
    public static void main (String[] args) {
        int n, st1 = 7, st2 = 5, i =0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print(st1+i + " ");
            System.out.print(st2+i + " ");
        }
        if( n %2 == 0)
            System.out.print(st1+i + " ");
    }
}
