package Collections.Queue;

import java.util.*;

public class PriorityQueueJava {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.add(in.nextInt());
        }
        System.out.println(q);
        in.close();
    }
}
