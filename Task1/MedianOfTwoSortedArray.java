package Task1;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        double meadian = 0;
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
            meadian += arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
            meadian += arr2[i];
        }
        System.out.println((meadian / (n1 + n2)));
    }
}
