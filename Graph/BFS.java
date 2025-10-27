import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private ArrayList<ArrayList<Integer>> graph;
    private boolean[] visited;
    private ArrayList<Integer> traversalOrder;

    public BFS(int vertices) {
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // 양방향 간선 추가
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // 단방향 간선 추가
    public void addDirectedEdge(int from, int to) {
        graph.get(from).add(to);
    }

    // 모든 vertex에 대한 BFS
    public ArrayList<Integer> traverseAll() {
        visited = new boolean[graph.size()];
        traversalOrder = new ArrayList<>();

        for (int vertex = 0; vertex < graph.size(); vertex++) {
            if (!visited[vertex]) {
                bfsIterative(vertex);
            }
        }

        return traversalOrder;
    }

    // 특정 vertex부터 BFS
    public ArrayList<Integer> traverseFrom(int startVertex) {
        visited = new boolean[graph.size()];
        traversalOrder = new ArrayList<>();
        bfsIterative(startVertex);
        return traversalOrder;
    }

    private void bfsIterative(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            traversalOrder.add(currentVertex);

            for (int neighbor : graph.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
