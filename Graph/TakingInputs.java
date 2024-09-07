package Graph;

import java.util.*;

public class TakingInputs {
    public static void main(String[] args) {
        int n = 0, m = 0, u = 0, v = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            u = in.nextInt();
            v = in.nextInt();
            graph.get(u).add(v);
            // graph.get(v).add(u);
        }
        System.out.println(graph);
    }
}
