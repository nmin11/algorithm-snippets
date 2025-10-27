import java.util.LinkedList
import java.util.Queue

class BFS(vertices: Int) {
    private val graph: MutableList<MutableList<Int>> = MutableList(vertices) { mutableListOf() }
    private lateinit var visited: BooleanArray
    private lateinit var traversalOrder: MutableList<Int>

    // 양방향 간선 추가
    fun addEdge(u: Int, v: Int) {
        graph[u].add(v)
        graph[v].add(u)
    }

    // 단방향 간선 추가
    fun addDirectedEdge(from: Int, to: Int) {
        graph[from].add(to)
    }

    // 모든 vertex에 대한 DFS
    fun traverseAll(): List<Int> {
        visited = BooleanArray(graph.size)
        traversalOrder = mutableListOf()

        for (vertex in graph.indices) {
            if (!visited[vertex]) {
                bfsIterative(vertex)
            }
        }

        return traversalOrder
    }

    // 특정 vertex부터 DFS
    fun traverseFrom(startVertex: Int): List<Int> {
        visited = BooleanArray(graph.size)
        traversalOrder = mutableListOf()
        bfsIterative(startVertex)
        return traversalOrder
    }

    private fun bfsIterative(startVertex: Int) {
        val queue: Queue<Int> = LinkedList()
        visited[startVertex] = true
        queue.offer(startVertex)

        while (queue.isNotEmpty()) {
            val currentVertex = queue.poll()
            traversalOrder.add(currentVertex)

            for (neighbor in graph[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true
                    queue.offer(neighbor)
                }
            }
        }
    }
}
