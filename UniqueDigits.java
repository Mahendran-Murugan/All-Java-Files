import java.util.Arrays;

public class UniqueDigits {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 112;
        int count = 0;
        boolean flag = false;
        int arr[] = new int[10];
        for (int i = n1; i <= n2; i++) {
            Arrays.fill(arr, 0);
            flag = false;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                temp /= 10;
                if (arr[digit] == 0) {
                    arr[digit]++;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}
