package Task1;

import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = Arrays.stream(dp).max().orElse(0);
        return maxLength;
    }
}

public class LongestIncreasingSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(arr));
    }
}