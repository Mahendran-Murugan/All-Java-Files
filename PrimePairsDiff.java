import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePairsDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        boolean flag = true;
        List<Integer> l = new ArrayList<Integer>();
        for (int i = n; i <= m; i++) {
            flag = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                l.add(i);
            }
        }
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(j) - l.get(i) == 6) {
                    count++;
                } else if (l.get(j) - l.get(i) > 6) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
