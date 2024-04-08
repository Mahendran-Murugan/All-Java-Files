import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;


public class deleteEndElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            q.add(in.nextInt());
        }
        Iterator<Integer> i =  q.iterator();
        while (!q.isEmpty()) {
            while (i.hasNext()&& i.hasNext()) {
                i.next();
                i.next();
            }
            System.out.println(q.remove(i.next()));
        }
    }
}
