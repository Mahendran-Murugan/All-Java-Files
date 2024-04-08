import java.util.Scanner;
import java.util.*;

public class printIntegersInAccendingOrderQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Character> q = new PriorityQueue<Character>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.add(in.next().charAt(0));
        }
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        in.close();
    }   
}
