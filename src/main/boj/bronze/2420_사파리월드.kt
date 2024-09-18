package bronze

import kotlin.math.abs
import java.util.*

fun main() {
    val input = readln()
    val st = StringTokenizer(input)
    val n = st.nextToken().toLong()
    val m = st.nextToken().toLong()
    println(abs(n - m))
}