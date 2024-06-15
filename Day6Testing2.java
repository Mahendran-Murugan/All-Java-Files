// import java.util.*;

public class Day6Testing2 {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = high - 1;
        }
        return -2;
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                return binarySearch(arr, mid + 1, high, target);
            else
                return binarySearch(arr, low, mid - 1, target);

        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 3, -1, -2, -3 };
        // Arrays.sort(arr);
        // ArrayList<String> l = new ArrayList<>(Arrays.asList(
        // "Aaahi", "Aahi"));
        // Collections.sort(l);
        // System.out.println(l);
        // System.out.println(Arrays.toString(arr));
        int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = -1;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));

    }
}