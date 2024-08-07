package silver

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { IntArray(n + 1) }
    var visited = ArrayList<Int>()

    repeat(m) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        // 양방향 그래프이므로 서로 이어주기
        graph[x][y] = 1
        graph[y][x] = 1
    }

}

fun dfs(start: Int, graph: Array<IntArray>, visited: ArrayList<Int>) {
    visited.add(start)
    
}

fun bfs(start: Int, graph: Array<IntArray>, visited: ArrayList<Int>) {

}