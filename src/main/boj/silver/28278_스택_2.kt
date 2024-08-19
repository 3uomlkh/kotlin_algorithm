package silver

import java.io.*
import java.util.ArrayList
import java.util.StringTokenizer

val stack = ArrayList<Int>()
var size = 0

// 시간 초과 -> StringTokenizer와 StringBuilder로 수정 후 통과
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val input = st.nextToken().toInt()
        var x = 0
        if (st.hasMoreTokens()) {
            x = st.nextToken().toInt()
        }

        when(input) {
            1 -> push(x)
            2 -> sb.append(pop()).append("\n")
            3 -> sb.append(size()).append("\n")
            4 -> sb.append(isEmpty()).append("\n")
            5 -> sb.append(peak()).append("\n")
        }
    }
}

fun push(x: Int) {
    stack.add(x)
    size++
}

fun pop(): Int {
    if (size == 0) {
        return -1
    }
    val num = stack[size -1]
    stack.removeAt(size -1)
    size--
    return num
}

fun size(): Int {
    return size
}

fun isEmpty(): Int {
    return if (size == 0) return 1 else 0
}

fun peak(): Int {
    if (size == 0) {
        return -1
    }
    return stack[size - 1]
}