package Collections.Queue;

import java.util.*;

public class PriorityQueueJava {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.add(in.nextInt());
        }
        for(int i = 0; i < n; i++){
            System.out.println(q.poll());
        }
    }
}
