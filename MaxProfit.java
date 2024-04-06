import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (i != 0 && arr[i] > arr[i - 1]) {
                maxProfit += arr[i] - arr[i - 1];
            }
        }
        System.out.println(maxProfit);
        in.close();
    }
}
