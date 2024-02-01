import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((((n/10)%10)%3) == 0){ System.out.println("Trendy Number"); return;}
        System.out.println("Not Trendy Number");
    }
}
