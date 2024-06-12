import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Collections;

import Collections.Map.LinkedHashMapJava;
import Collections.Queue.PriorityQueueJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Day3Testing {

    public static <L> ArrayList<L> returnArrayList() {
        return new ArrayList<L>();
    }

    public static void main(String[] args) {
        // List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
        // 10));
        // ArrayList<Integer> l2 = new ArrayList<Integer>(
        // Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1));

        // List<Integer> ll = new LinkedList<>();
        // ll.add(1);
        // ll.add(2);
        // ll.add(3);
        // ll.addFirst(0);
        // ll.addLast(4);
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());
        // ll.removeFirst();
        // ll.removeLast();

        // 1 2 3
        // 0 1 2

        // 1 -> 2 ->3 -> 1
        // System.out.println(ll);

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

        List<Integer> v = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        // for (int i : v) {
        // System.out.println(i);
        // }
        // Iterator<Integer> it = v.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // System.out.println(v);
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove(2));
        // System.out.println(q);

        // Queue<Integer> pq = new PriorityQueue<>(); // Min heap
        // pq.addAll(Arrays.asList(1, 2, 3, 4, 5, 10, -1, -10));
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Max
        // heap
        // pq.addAll(Arrays.asList(1, 2, 3, 4, 5, 10, -1, -10));
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // Queue<Integer> pq = new PriorityQueue<>((c, d) -> d - c); // Max heap
        // pq.addAll(Arrays.asList(1, 2, 3, 4, 5, 10, -1, -10));
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // (1,2) -> (2 - 1) = 1

        // Deque<Integer> d = new ArrayDeque<>();
        // d.addFirst(1);
        // d.addLast(2);
        // d.addFirst(0);
        // d.addLast(3);
        // System.out.println(d.pollFirst());
        // System.out.println(d.pollLast());
        // System.out.println(d.peekFirst());
        // System.out.println(d.peekLast());
        // d.push(0);
        // d.push(2);
        // d.add(0);
        // System.out.println(d);

        // Set<Integer> s = new HashSet<>();
        // s.add(1);
        // s.add(22);
        // s.add(31);
        // s.add(-4);
        // s.add(59);
        // System.out.println(s);

        // Set<Integer> s = new LinkedHashSet<>();
        // s.add(1);
        // s.add(22);
        // s.add(31);
        // s.add(-4);
        // s.add(59);
        // System.out.println(s);

        // SortedSet<Integer> s = new TreeSet<>(Collections.reverseOrder());
        // s.add(1);
        // s.add(22);
        // s.add(31);
        // s.add(-4);
        // s.add(59);
        // System.out.println(s);

        // Map<Integer, String> m = new HashMap<>();
        // m.put(11, "Mahi");
        // m.put(-2, "Mohan");
        // m.put(-21, "Mohan");
        // m.put(22, "Mohan");
        // m.put(30, "Sri");
        // m.put(1, "Sri");
        // // m.replace(1, "Mahendran");
        // System.out.println(m);

        // Map<Integer, String> m = new LinkedHashMap<>();
        // m.put(11, "Mahi");
        // m.put(-2, "Mohan");
        // m.put(-21, "Mohan");
        // m.put(22, "Mohan");
        // m.put(30, "Sri");
        // m.put(1, "Sri");
        // // m.replace(1, "Mahendran");
        // System.out.println(m);

        SortedMap<Integer, String> m = new TreeMap<>();
        m.put(11, "Mahi");
        m.put(-2, "Mohan");
        m.put(-21, "Mohan");
        m.put(22, "Mohan");
        m.put(30, "Sri");
        m.put(1, null);
        // m.replace(1, "Mahendran");
        // System.out.println(m);
        m.forEach((key, val) -> {
            System.out.println(key + " " + val);
        });

        v.forEach(System.out::println);
        System.out.println(m.hashCode());
        System.out.println(m.size());
    }
}
