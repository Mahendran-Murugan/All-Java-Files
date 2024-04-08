
package Collections.Queue;

import java.util.*;

public class DeQueueJava {
    public static void main(String[] args) {
        Deque q = new ArrayDeque();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.addLast(in.nextInt());
        }
        for(int i = 0; i < n; i++){
            System.out.println(q.removeFirst());
        }
        for(int i = 0; i < n; i++){
            q.addFirst(in.nextInt());
        }
        for(int i = 0; i < n; i++){
            System.out.println(q.removeLast());
        }
    }
}
