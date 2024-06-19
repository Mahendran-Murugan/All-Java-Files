import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Day10Testing {

    public static void findPermutations(List<List<Integer>> ans, int[] nums, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                findPermutations(ans, nums, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        findPermutations(ans, arr, ds, freq);
        return ans;
    }

    public static void maxColFinder() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE, sum = 0, maxCol = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[j][i];
            }
            if (maxSum < sum) {
                maxSum = sum;
                maxCol = i;
            }
        }

        System.out.println("max sum is: " + maxSum);
        System.out.println("max sum column is: " + (maxCol + 1));
        in.close();
    }

    public static List<String> mostRepeatedWords(String str) {
        List<String> res = new ArrayList<>();
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        int maxAppearance = 0;
        for (Map.Entry<String, Integer> mapElement : map.entrySet()) {
            int val = mapElement.getValue();
            String key = mapElement.getKey();
            if (val == maxAppearance) {
                res.add(key);
            } else if (val > maxAppearance) {
                maxAppearance = val;
                res = new ArrayList<>();
                res.add(key);
            }
        }
        return res;
    }

    public static String removeRepeatedWords(String str) {
        StringBuilder res = new StringBuilder();
        Set<Character> s = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!s.contains(letter)) {
                s.add(letter);
            } else {
                s.remove(letter);
            }
        }
        // s.forEach((i) -> {
        // res.append(i);
        // });
        for (char i : s) {
            res.append(i);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // maxColFinder();
        // System.out.println(removeRepeatedWords("Mahendran"));
        System.out.println(mostRepeatedWords("mahendran is a programmer and mahendran is a hacker"));
    }
}

// Question 1
// 0 1 2 3
// 1 0 1 1
// 2 0 0 0
// 3 1 0 1
// 1 0 0 3
// 4 1 1 1

// Question 2
// Mahendran
// Mhedr

// Question 3
// mahendran is a programmer and mahendran is a hacker.

// Question 4
//

// Question 5
// [3, 4, 2, 5, 6, 0, 100]