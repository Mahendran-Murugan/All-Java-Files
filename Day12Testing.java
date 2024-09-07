import java.util.*;
import java.util.Map;

public class Day12Testing {
    public static String removeRepeatedWords(String str) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> element : map.entrySet()) {
            if (element.getValue() == 1) {
                res.append(element.getKey());
            }
        }
        return res.toString();
    }

    public static int maxSumCalc(int[] arr, int k) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int l = 0, r = k - 1, n = arr.length - 1;
        for (int i = l; i <= r; i++) { // 0, 1, 2
            // System.out.println(i + ":" + arr[i]);
            sum += arr[i];
        } // 0, 1, 2, 3, 4, 5 // 6
        maxSum = Math.max(maxSum, sum);
        while (r < n) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(removeRepeatedWords("swiss"));
        System.out.println(maxSumCalc(new int[] { 0, 1, 2, 3, 4, -1, 9, 8 }, 4));
    }
}

// contains

// Question
// swiss