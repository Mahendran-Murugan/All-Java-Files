import java.util.Scanner;

public class QuickSort {

    public static void swap(int[] arr, int i, int pi) {
        int temp = arr[i];
        arr[i] = arr[pi];
        arr[pi] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[end];
        int pivotIndex = st - 1;
        for (int i = st; i < end; i++) {
            if (arr[i] < pivot) {
                ++pivotIndex;
                swap(arr, i, pivotIndex);
            }
        }
        ++pivotIndex;
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivotPos = partition(arr, st, end);
            quickSort(arr, st, pivotPos - 1);
            quickSort(arr, pivotPos + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
