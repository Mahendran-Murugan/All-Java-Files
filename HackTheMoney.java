import java.util.Scanner;

public class HackTheMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int target = in.nextInt();
            if (hack(target, 1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        in.close();
    }

    public static boolean hack(int target, int current) {
        if (current == target)
            return true;
        else if (current > target)
            return false;
        else {
            if (hack(target, 10 * current))
                return true;
            return hack(target, 20 * current);
        }
    }
}