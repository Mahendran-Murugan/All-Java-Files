import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    private static final Map<Character, String> PHONE_MAP = new HashMap<>();

    static {
        PHONE_MAP.put('2', "abc");
        PHONE_MAP.put('3', "def");
        PHONE_MAP.put('4', "ghi");
        PHONE_MAP.put('5', "jkl");
        PHONE_MAP.put('6', "mno");
        PHONE_MAP.put('7', "pqrs");
        PHONE_MAP.put('8', "tuv");
        PHONE_MAP.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        letterCombinationsHelper(digits, 0, "", result);
        return result;
    }

    private static void letterCombinationsHelper(String digits, int index, String combination, List<String> result) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }
        char digit = digits.charAt(index);
        String letters = PHONE_MAP.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(digits, index + 1, combination + letters.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        for (String r : result) {
            System.out.print(r + " ");
        } 
    }
}