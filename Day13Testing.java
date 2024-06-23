import java.util.*;
import java.util.LinkedList;

public class Day13Testing {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Deque<Integer> q = new LinkedList<>();
        SortedSet<Integer> s = new TreeSet<>();
        SortedMap<Character, Integer> m = new TreeMap<>();
        q.addFirst(null);
        q.addLast(null);
        // int[] arr = new int[] { 1, 1, 1, 1, 1, };
        // System.out.println(Arrays.stream(arr).average());
        // Iterator<Integer> it = l.iterator();
        // while (it.hasNext()) {
        // int i = it.next();
        // if (i == 2) {
        // it.remove();
        // } else {
        // System.out.println(i);
        // }
        // }

        l.forEach((i) -> {
            if (i == 2)
                l.remove(i);
        });

        System.out.println(l);
    }
}
