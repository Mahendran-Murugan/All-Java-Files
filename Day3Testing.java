import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Day3Testing {

    public static <L> ArrayList<L> returnArrayList() {
        return new ArrayList<L>();
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> l2 = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1));

        // add, remove , contains, get, index, lastIndexOf, size

        // System.out.println(l2);
        // l2.clear();
        // System.out.println(l1.containsAll(l2));
        // int[] a = new int[];
        // int j = 0;
        // for (int i : l1) {
        // a[j] = i;
        // j++;
        // }
        // System.out.println(Arrays.toString(a));
        // l2.forEach(System.out::println);
        // returnArrayList();
    }
}
