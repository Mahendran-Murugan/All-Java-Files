import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        // l.forEach((i) -> {
        // if (i == 2)
        // l.remove(i);
        // });

        // System.out.println(l);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 4));
        Predicate<Integer> aboveThree = (i) -> i > 3;
        List<Integer> filterdList = list.stream().map((i) -> i * 2).collect(Collectors.toList());
        System.out.println(filterdList);
    }
}
