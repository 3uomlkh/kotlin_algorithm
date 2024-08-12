package bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val sb = StringBuilder()
    for (i in input) {
        var c = i.code - 3
        if (c < 65) {
            c += 26
        }
        sb.append(c.toChar())
    }
    println(sb)
}