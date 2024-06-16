import java.util.Scanner;

class Main {

    public static void merger(int[] arr, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        int left = 0, right = 0, arrP = start;
        while (left < leftSize && right < rightSize) {
            if (leftArr[left] <= rightArr[right]) {
                arr[arrP++] = leftArr[left++];
            } else {
                arr[arrP++] = rightArr[right++];
            }
        }
        while (left < leftSize)
            arr[arrP++] = leftArr[left++];
        while (right < rightSize)
            arr[arrP++] = rightArr[right++];
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merger(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}