package Task1;
import java.util.PriorityQueue;
import java.util.*;

public class ShortestPath {
    public int dijkstra(int[][] graph, int source, int destination) {
        int[] distances = new int[graph.length];
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Node> queue = new PriorityQueue<>();

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        queue.add(new Node(source, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (visited[current.node]) continue;
            visited[current.node] = true;

            for (int neighbor : graph[current.node]) {
                int distance = current.distance + 1;

                if (distance < distances[neighbor]) {
                    distances[neighbor] = distance;
                    queue.add(new Node(neighbor, distance));
                }
            }
        }

        return distances[destination];
    }

    private static class Node implements Comparable<Node> {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 4}, {1, 0, 4}, {7, 8, 0}, {7, 11, 2, 0}};
        ShortestPath sol = new ShortestPath();
        System.out.println(sol.dijkstra(graph, 0, 3));
    }
}