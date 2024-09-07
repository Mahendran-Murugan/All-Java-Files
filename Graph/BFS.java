package Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int n, m, u, v, st, node;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        List<List<Integer>> adjGraph = new ArrayList<>(n + 1);
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            adjGraph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            u = in.nextInt();
            v = in.nextInt();
            adjGraph.get(u).add(v);
            // adjGraph.get(v).add(u);
        }
        System.out.println("Enter the Starting node:");
        st = in.nextInt();
        System.out.println("Traversal using BFS:");
        in.close();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(st);
        visited[st] = true;
        while (!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node);
            for (int i : adjGraph.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
