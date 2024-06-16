import java.util.Arrays;

public class Day7Testing {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[end];
        int pivotIndex = st - 1;
        for (int i = st; i < end; i++) {
            if (arr[i] < pivot) {
                pivotIndex++;
                swap(arr, pivotIndex, i);
            }
        }
        pivotIndex++;
        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivot = partition(arr, st, end);
            quickSort(arr, st, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, -10, -30, 100, 30 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
