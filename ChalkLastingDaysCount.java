import java.util.Scanner;

public class ChalkLastingDaysCount {
    public static void main(String[] args) {
        int noOfChalks = 0;
        Scanner in = new Scanner(System.in);
        noOfChalks = in.nextInt();
        System.out.println(noOfChalks+(int)(noOfChalks*(1/Math.sqrt(noOfChalks)))+1);
    }
}
