import java.util.*

data class Edge(val to: Int, val weight: Int)

data class Node(val vertex: Int, val distance: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int = distance.compareTo(other.distance)
}

/**
 * Dijkstra's algorithm - finds shortest path from start to all vertices
 * Time Complexity: O((V + E) log V)
 * Space Complexity: O(V + E)
 *
 * @param graph adjacency list representation of graph
 * @param start starting vertex
 * @return array of shortest distances from start to each vertex
 */
fun dijkstra(graph: List<List<Edge>>, start: Int): IntArray {
    val n = graph.size
    val dist = IntArray(n) { Int.MAX_VALUE }
    dist[start] = 0

    val pq = PriorityQueue<Node>()
    pq.offer(Node(start, 0))

    while (pq.isNotEmpty()) {
        val (u, d) = pq.poll()

        // Skip if we already found a better path
        if (d > dist[u]) continue

        for ((v, weight) in graph[u]) {
            if (dist[u] + weight < dist[v]) {
                dist[v] = dist[u] + weight
                pq.offer(Node(v, dist[v]))
            }
        }
    }

    return dist
}
