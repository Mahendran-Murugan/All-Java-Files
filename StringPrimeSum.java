import java.util.Scanner;

public class StringPrimeSum {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = 0;
        int len = s.length();
        int sum = 0;
        boolean flag = true;
        boolean isNeg = false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '-') {
                isNeg = true;
                continue;
            }
            flag = true;
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                n = n * 10 + (s.charAt(i) - '0');
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            n = isNeg ? n * 11 : n;
            for (int j = 2; j <= n; j++) {
                if (isPrime(j)) {
                    sum += j;
                }
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
        in.close();
    }
}