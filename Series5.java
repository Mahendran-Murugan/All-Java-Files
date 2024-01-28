package Coding;

import java.util.Scanner;

public class Series5 {
    public static void main (String[] args) {
        int prev1 = 0, prev2 = 1, current, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n;
             i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
            System.out.print(prev2 + " ");
        }
    }
}
