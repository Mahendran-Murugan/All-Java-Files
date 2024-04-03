import java.util.Arrays;

public class NewFile {
    static boolean prime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static int findPrime(int num) {
        boolean prime[] = new boolean[num + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= num; i++) {
            if (prime[i] == true) {
                for (int j = 2 * i; j <= num; j += i)
                    prime[j] = false;
            }
        }
        int first = num - 1;
        while (prime[first] == false) {
            first--;
        }
        int second = 0;
        for (int i = num + 1;; i++)
            if (prime(i)) {
                second = i;
                break;
            }
        return Math.min(second, first);
    }

    public static void main(String[] args) {
        System.err.println(findPrime(12));
    }
}
