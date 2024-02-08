

import java.util.Scanner;

public class SavingsWithExpenses {
    public static void main (String[] args) {
        int salary = 0, interest = 0, hostelFee = 0, foodExp = 0, parentsCare = 0;
        Scanner in = new Scanner(System.in);
        salary = in.nextInt();
        interest = in.nextInt();
        hostelFee = in.nextInt();
        foodExp = in.nextInt();
        parentsCare = in.nextInt();
        if (salary < (interest + hostelFee + foodExp + parentsCare))
            System.out.println("He has to work hard");
        else
            System.out.println("He can save the money");
    }
}
