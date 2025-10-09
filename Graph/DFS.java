public class DFS {
    private ArrayList<ArrayList<Integer>> graph;
    private boolean[] visited;
    private ArrayList<Integer> traversalOrder;

    public DFS(int vertices) {
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

    // 모든 vertex에 대한 DFS
    public ArrayList<Integer> traverseAll() {
        visited = new boolean[graph.size()];
        traversalOrder = new ArrayList<>();
        
        for (int vertex = 0; vertex < graph.size(); vertex++) {
            if (!visited[vertex]) {
                dfsRecursive(vertex);
            }
        }
        
        return traversalOrder;
    }

    // 특정 vertext부터 DFS
    public ArrayList<Integer> traverseFrom(int startVertex) {
        visited = new boolean[graph.size()];
        traversalOrder = new ArrayList<>();
        dfsRecursive(startVertex);
        return traversalOrder;
    }

    private void dfsRecursive(int currentVertex) {
        visited[currentVertex] = true;
        traversalOrder.add(currentVertex);
        
        for (int neighbor : graph.get(currentVertex)) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor);
            }
        }
    }
}
