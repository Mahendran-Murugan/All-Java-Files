package Task1;

import java.util.*;
import java.util.Scanner;

public class LongestSubStringWithoutRepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Map<Character, Integer> mpp = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        int start = 0;
        for (int right = 0; right < n; right++) {
            if (mpp.containsKey(s.charAt(right))) {
                left = Math.max(mpp.get(s.charAt(right)) + 1, maxLength);
            }
            mpp.put(s.charAt(right), right);
            if (maxLength < right - left + 1) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        System.out.println(s.substring(start, start + maxLength));

    }
}