import java.util.List;
import java.util.*;

public class Day11Testing {
    public static void findPermutations(char[] arr, List<String> ans, StringBuilder ds, boolean[] freq) {
        if (ds.length() == arr.length) {
            ans.add(ds.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.append(arr[i]);
                findPermutations(arr, ans, ds, freq);
                freq[i] = false;
                ds.deleteCharAt(ds.length() - 1);
            }
        }
    }

    public static List<String> permutation(char[] arr, String forbidden) {
        List<String> ans = new ArrayList<>();
        StringBuilder ds = new StringBuilder();
        boolean[] freq = new boolean[arr.length];
        findPermutations(arr, ans, ds, freq);
        List<String> res = new ArrayList<>();
        for (String i : ans) {
            if (!i.contains(forbidden)) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(permutation("abc".toCharArray(), "ab"));
    }
}