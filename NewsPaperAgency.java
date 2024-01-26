package Coding;

import java.util.Scanner;

public class NewsPaperAgency {
    public static void main(String[] args){
        int copies = 0, sellingPrice = 0, costPrice = 0;
        Scanner in = new Scanner(System. in);
        copies = in.nextInt ();
        sellingPrice = in.nextInt() ;
        costPrice = in.nextInt();
        System.out.println(copies*(sellingPrice-costPrice)-100);
    }
}
