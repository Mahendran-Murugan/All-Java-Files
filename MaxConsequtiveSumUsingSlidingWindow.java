public class MaxConsequtiveSumUsingSlidingWindow {
    public static int calMaxSum(int[] arr, int k) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int l = 0, r = k - 1, n = arr.length;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum);
        while (r < n - 1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -1, 2, 3, 3, 4, 5, -1 };
        System.out.println("Max: " + calMaxSum(arr, 4));
    }
}
