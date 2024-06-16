import java.util.Arrays;

public class Day7Testing2 {

    public static void merger(int[] arr, int st, int mid, int end) {
        int ls = mid - st + 1;
        int rs = end - mid;
        int lArr[] = new int[ls];
        int rArr[] = new int[rs];
        for (int i = 0; i < ls; i++) {
            lArr[i] = arr[st + i];
        }
        for (int i = 0; i < rs; i++) {
            rArr[i] = arr[mid + i + 1];
        }
        int left = 0, right = 0, arrP = st;
        while (left < ls && right < rs) {
            if (lArr[left] <= rArr[right]) {
                arr[arrP++] = lArr[left++];
            } else {
                arr[arrP++] = rArr[right++];
            }
        }
        while (left < ls) {
            arr[arrP++] = lArr[left++];
        }
        while (right < rs) {
            arr[arrP++] = rArr[right++];
        }
    }

    public static void mergeSort(int arr[], int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, end);
            merger(arr, st, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, -10, -20, 30 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}