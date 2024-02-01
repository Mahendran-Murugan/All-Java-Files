import java.util.Scanner;

public class LucasSequence {
    public static void main(String[] args) {
        int pre1 = 0, pre2 = 0, pre3 = 1, curr = 0, n, temp = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 1) System.out.print(pre1);
        if (n == 2) System.out.print(pre1+" "+pre2);
        if (n >= 3) System.out.print(pre1+" "+pre2+" "+pre3+" ");
        for(int i = 3; i < n; i++){
            curr = pre1 + pre2 + pre3;
            System.out.print(curr+ " ");
            pre1 = pre2;
            pre2 = pre3;
            pre3 = curr;
        }
    }
}
