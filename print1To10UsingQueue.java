import java.util.LinkedList;
import java.util.Queue;

public class print1To10UsingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 1;i <= 10 ; i++){
            if(i % 2 == 0)
            q.add(i);
        }
        q.forEach(System.out::println);
    }
}
