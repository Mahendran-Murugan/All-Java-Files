import java.util.Arrays;

public class Day8Testing {

    public static void solution(int[] arr) {
        int arr2[] = Arrays.copyOf(arr, arr.length); // O(n)
        // O(1) O(n)
        arr2[0] = 0;
    }

    public static void LinearSearch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 1) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public static void recursion() {
        recursion();
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int arr[] = new int[10]; // n
        // Arrays.fill(arr, -1);
        // arr[arr.length - 1] = 0;
        // LinearSearch(arr);
        pattern1(5);
        // System.out.println(Arrays.toString(arr));
    }
    // 0 1
    // 0 // *
    // 1 // * *
    // 2 // * * *

    // * * * * *
    // * *
    // * *
    // * *
    // *

}
