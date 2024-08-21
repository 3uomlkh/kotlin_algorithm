package silver

import java.io.*

private val heap = IntArray(100001)
private var size = 1
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val x = br.readLine().toInt()
        if (x == 0) {
            sb.append(pop()).append("\n")
        } else {
            push(x)
        }
    }

    println(sb.toString())
}

private fun push(x: Int) {
    heap[size] = x
    var child = size
    var parent = child / 2

    while (child > 1 && heap[parent] < heap[child]) {
        val temp = heap[parent]
        heap[parent] = heap[child]
        heap[child] = temp
        child = parent
        parent = child / 2
    }
    size++
}

private fun pop(): Int {
    if (size == 1) return 0
    val max = heap[1]
    heap[1] = heap[--size]
    var parent = 1
    var child = 2

    while (child < size) {
        // 오른쪽 자식이 존재하고, 오른쪽 자식이 왼쪽 자식보다 큰 경우
        if (child + 1 < size && heap[child] < heap[child + 1]) child++
        if (heap[parent] >= heap[child]) break

        // 부모와 자식 노드 교환
        val temp = heap[parent]
        heap[parent] = heap[child]
        heap[child] = temp
        parent = child
        child = parent * 2
    }

    return max
}