import java.util.*;
import java.util.Map;

public class Day12Testing {
    public static String removeRepeatedWords(String str) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        char c;
        for (int i = 0; i < str.length(); i++) { // swiss {s:3,w:1,i:1}
            c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> element : map.entrySet()) {
            if (element.getValue() == 1) {
                res.append(String.valueOf(element.getKey()));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeRepeatedWords("swiss"));
    }
}

// contains

// Question
// swiss