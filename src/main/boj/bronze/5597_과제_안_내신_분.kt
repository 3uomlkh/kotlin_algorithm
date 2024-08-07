package bronze

import java.io.*
import java.lang.StringBuilder

fun main() {
    val arr = Array(28) { 0 }
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 0..27) {
        arr[i] = br.readLine().toInt()
    }

    var min = Integer.MAX_VALUE
    var max = Integer.MIN_VALUE
    val sb = StringBuilder()
    for (i in 1..30) {
        if (!arr.contains(i)) {
            if (min > i) {
                min = i
            } else {
                max = i
            }
        }
    }

    sb.append(min).append("\n").append(max)
    println(sb.toString())
}