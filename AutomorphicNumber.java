package Coding;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main (String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if ((n * n) % 10 == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
