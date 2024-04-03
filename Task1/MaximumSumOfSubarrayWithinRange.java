public class MaximumSumOfSubarrayWithinRange {
    public static int maxSumSubArray(int[] nums, int left, int right) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 0, 3};
        int left = 1;
        int right = 3;
        int maxSum = maxSumSubArray(nums, left, right);
        System.out.println("Maximum sum of subarray within range [" + left + ", " + right + "] is " + maxSum);
    }
}