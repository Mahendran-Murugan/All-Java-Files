import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class NearestPrimeNo {
    public static int findPrime(int m) {
        int prev = 0;
        boolean[] prime = new boolean[m + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= m; i++) {
            if (prime[i]) {
                for (int j = i * 2; j <= m; j += i) {
                    prime[j] = false;
                }
            }
        }
        while (m > 0) {
            if (prime[m - 1]) {
                prev = m - 1;
                break;
            }
            m--;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prev = findPrime(n);
        int next = 0;
        boolean flag = true;
        for (int i = n + 1;; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                next = i;
                break;
            }
        }
        if (n - prev < next - n) {
            System.out.println(prev);
        } else {
            System.out.println(next);
        }
    }
}
