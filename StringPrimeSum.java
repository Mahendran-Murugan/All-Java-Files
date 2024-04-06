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
        int i = 0, sum = 0;
        boolean flag = true;
        boolean isNeg = (s.charAt(0) == '-') ? true : false;
        i = isNeg ? i + 1 : i;
        while (i < len) {
            flag = true;
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                n = n * 10 + (s.charAt(i) - '0');
            } else {
                flag = false;
                break;
            }
            i++;
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
