package Task1;
import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {
    public List<String> generate(String input) {
        List<String> result = new ArrayList<>();
        if (input.isEmpty()) {
            result.add("");
            return result;
        }

        char first = input.charAt(0);
        String rem = input.substring(1);
        List<String> permutations = generate(rem);

        for (String perm : permutations) {
            for (int i = 0; i <= perm.length(); i++) {
                result.add(new StringBuilder(perm).insert(i, first).toString());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        GeneratePermutations s = new GeneratePermutations();
        List<String> result = s.generate("abc");
        for (String perm : result) {
            System.out.println(perm);
        }
    }
}