import java.util.Scanner;

public class ReverseUntilUnderscore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.next());
        int last = sb.indexOf("_") - 1;
        char temp;
        if (last != -2) {
            for (int i = last, j = 0; i > last / 2; i--, j++) {
                temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
            }
        }
        System.out.println(sb);
        in.close();
    }
}
