// package Coding;

import java.util.Scanner;

public class DecimalToBinaryUsingReturnType {

    public static int toBinary(int n){
        if(n == 0) return 0;
        return n % 2 + 10 * toBinary(n/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(toBinary(n));
    }
}
