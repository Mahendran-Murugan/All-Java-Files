import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;


public class printRequiredMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Character> q = new LinkedList<Character>();
        for(int i = 0; i < n; i++){
            q.add(in.next().charAt(0));
        }
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" "+q.poll()+" ");
        }
        System.out.println();
        System.out.println(q.poll());
    }
}
