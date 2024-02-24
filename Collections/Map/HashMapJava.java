package Collections.Map;

import java.util.*;

public class HashMapJava {
    public static void main(String[] args) {
        Map<Integer, String> q = new HashMap<Integer, String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            q.put(i, in.next());
        }
        for(Object key: q.keySet()){
            System.out.println(key+" ---> "+q.get(key));
        }
    }
}
