import java.util.Scanner;

public class RobotMove {

    public static int possibleWays(int n, int m) {
        if (n == 0 && m == 0)
            return 1;
        if (n < 0 || m < 0)
            return 0;
        return possibleWays(n - 1, m) + possibleWays(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(possibleWays(n - 1, m - 1));
        in.close();
    }
}
