package Collections.Queue;

import java.util.*;
import java.util.Scanner;

public class QueueJava {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(q.poll());
        }
    }
}
