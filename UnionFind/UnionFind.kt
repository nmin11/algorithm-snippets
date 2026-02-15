class UnionFind(size: Int) {
    private val parent: IntArray = IntArray(size) { it }

    fun find(x: Int): Int {
        if (parent[x] != x) {
            parent[x] = find(parent[x])
        }
        return parent[x]
    }

    fun union(x: Int, y: Int) {
        val rootX = find(x)
        val rootY = find(y)
        if (rootX != rootY) {
            parent[rootY] = rootX
        }
    }
}
