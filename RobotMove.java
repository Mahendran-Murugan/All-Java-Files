import java.util.Scanner;

public class RobotMove {

    public static int possibleWays(int arr[][], int n, int m) {
        if (n == 0 && m == 0)
            return 1;
        if (n < 0 || m < 0)
            return 0;
        return possibleWays(arr, n - 1, m) + possibleWays(arr, n, m - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println(possibleWays(arr, n - 1, m - 1));
        in.close();
    }
}
