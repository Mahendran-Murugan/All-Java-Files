import java.util.Scanner;

public class BookaTheAlien{
    public static void main(String[] args){
        int noOfDays;
        Scanner in = new Scanner(System.in);
        noOfDays = in.nextInt();
        System.out.printf("%d %d %d",(noOfDays/365),(noOfDays%365)/7,((noOfDays%365)%7));
    }
}