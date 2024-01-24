import java.util.Scanner;

public class DebtRepay{
    public static void main(String[] args){
        double year, principle, rate, simpleIntrest, discount, amount, finalSettelement;
        Scanner in = new Scanner(System.in);
        principle = in.nextDouble();
        year = in.nextDouble();
        rate = in.nextDouble();
        simpleIntrest = principle*year*rate/100;
        amount = principle+simpleIntrest;
        discount = simpleIntrest*0.02;
        finalSettelement = amount - discount;
        System.out.printf("%.2f\n%.2f\n%.2f\n%.2f\n",simpleIntrest,amount,discount,finalSettelement);
    }
}
