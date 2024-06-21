import java.util.Arrays;

public class MaxConsequtiveSumUsingSlidingWindow {
    public static int calMaxSum(int[] arr, int k) {
        int sum = 0, maxSum = Integer.MIN_VALUE; // -2,14,......
        int l = 0, r = k - 1, n = arr.length - 1;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum);
        while (r < n) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int maxSum(int[] arr, int k) {
        // Queue<Integer> maxQueue = new PriorityQueue<>((a, b) -> b - a);
        // for (int i : arr) {
        // maxQueue.add(i);
        // }
        // int sum = 0;
        // for (int i = 0; i < k; i++) {
        // sum += maxQueue.poll();
        // }
        // return sum;

        int sum = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 6, 2, 4, 1 };
        // System.out.println("Max: " + calMaxSum(arr, 4));
        System.out.println(maxSum(arr, 3));
    }
}
