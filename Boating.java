package Coding;

import java.util.Scanner;

public class Boating {
    public static void main (String[] args) {
        int capacity, noOfAdults, noOfChildren;
        Scanner in = new Scanner(System.in);
        capacity = in.nextInt();
        noOfAdults = in.nextInt();
        noOfChildren = in.nextInt();
        if (capacity >= (noOfAdults * 75 + noOfChildren * 30)) System.out.println("Boat is stable");
        else System.out.println("Boat will drown");
    }
}
