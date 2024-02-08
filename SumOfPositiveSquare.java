
import java.util.Scanner;

public class SumOfPositiveSquare {
    public static int sumPositive(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < arr[i] / 2; j++) {
                if (arr[i] == j * j) sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(sumPositive(n, arr));
    }
}
