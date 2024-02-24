
package Collections.Queue;

import java.util.*;

public class DeQueueJava {
    public static void main(String[] args) {
        Deque q = new ArrayDeque();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            if(i < n/2){
                q.addFirst(in.nextInt());
            }else{
                q.addLast(in.nextInt());
            }
        }
        for(int i = 0; i < n; i++){
            if(i < n/2){
                System.out.println(q.removeFirst());
            }else{
                System.out.println(q.removeLast());
            }
        }
    }
}
