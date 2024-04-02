import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static char[] sortArray(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "Mahi";
        char[] c = s.toCharArray();
        System.out.println();
        System.out.println(sortArray(c));
    }
}