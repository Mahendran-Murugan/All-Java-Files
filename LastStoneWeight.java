import java.util.*;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            maxHeap.add(i);
        }
        int firstLargest = 0;
        int secondLargest = 0;
        while (maxHeap.size() > 1) {
            firstLargest = maxHeap.poll();
            secondLargest = maxHeap.poll();
            if (firstLargest != secondLargest) {
                maxHeap.add(firstLargest - secondLargest);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        int stone[] = { 2, 7, 4, 1, 8, 1 };
        LastStoneWeight l = new LastStoneWeight();
        System.out.println(l.lastStoneWeight(stone));
    }
}