package Coding;

import java.util.Scanner;

public class StationaryShop {
    public static void main (String[] args) {
        String item;
        int availableC, amountOfItem, noOfItemNeed;
        Scanner in = new Scanner(System.in);
        item = in.next();
        availableC = in.nextInt();
        amountOfItem = in.nextInt();
        noOfItemNeed = in.nextInt();
        if (availableC <= 0) System.out.println("Out of stock");
        else if (availableC < noOfItemNeed) System.out.println(availableC);
        else System.out.println((noOfItemNeed * amountOfItem) + " " + (availableC - noOfItemNeed));
    }
}
