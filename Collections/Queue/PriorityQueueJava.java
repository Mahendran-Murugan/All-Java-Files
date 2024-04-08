package Collections.Queue;

import java.util.*;

public class PriorityQueueJava {
    public static void main(String[] args) {
        Queue<Character> q = new PriorityQueue<Character>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.add(in.next().charAt(0));
        }
        
        System.out.println(q);
        in.close();
    }
}
