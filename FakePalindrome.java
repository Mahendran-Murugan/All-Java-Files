import java.util.Scanner;

public class FakePalindrome {
    static boolean checkPalindrome(String str) {
        int[] hash = new int[128];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        int odd = 0;
        for (int i = 65; i <= 85; i++) {
            if ((hash[i] & 1) != 0) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; i + j <= str.length(); j++) {
                String temp = str.substring(i, i + j);
                if (checkPalindrome(temp)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        in.close();
    }
}