import java.util.*;
import java.util.Scanner;

public class DivideApple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int s = 0, m = 0, res = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
            s += arr1[i];
        }
        int avg = (s / n);
        for (int i = 0; i < n - 1; i++)
            arr2[i + 1] = arr2[i] + arr1[i] - avg;
        Arrays.sort(arr2, 0, n);
        m = -arr2[n / 2];
        for (int i = 0; i < n; i++)
            res += Math.abs(arr2[i] + m);
        System.out.println(res);
        in.close();
    }
}