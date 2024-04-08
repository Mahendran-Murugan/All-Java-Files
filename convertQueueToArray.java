import java.util.Scanner;
import java.util.*;
import java.util.LinkedList;
public class convertQueueToArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            q.add(in.nextInt());
        }
        Object arr[] = q.toArray();
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
