import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        int n1, res = 0;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        for(int i = 1; i <= n1/2; i++){
            if(n1 % i == 0) res += i;
        }
        if(res > n1) System.out.println("Abundant");
        else System.out.println("Not Abundant");

    }
}
