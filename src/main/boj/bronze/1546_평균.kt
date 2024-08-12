package bronze

import java.io.*
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st  = StringTokenizer(br.readLine())
    val arr = IntArray(n)
    var m = 0

    for (i in 0..<n) {
        arr[i] = st.nextToken().toInt()
    }

    for (score in arr) {
        if (score > m) {
            m = score
        }
    }

    var sum = 0.0
    for (i in arr.indices) {
        val newScore = arr[i].toDouble() / m.toDouble() * 100
        sum += newScore
    }

    println(sum / n.toDouble())
}