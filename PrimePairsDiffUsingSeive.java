import java.util.Arrays;
import java.util.Scanner;

public class PrimePairsDiffUsingSeive {

    public static int countPrime(int n, int m) {
        int count = 0;
        boolean[] prime = new boolean[m + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= m; i++) {
            if (prime[i]) {
                for (int j = i * 2; j <= m; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = n; i <= m - 6; i++) {
            if (prime[i] && prime[i + 6]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(countPrime(n, m));
    }
}
