package bronze

import java.util.StringTokenizer

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val st = StringTokenizer(readln())
        val r = st.nextToken().toInt()
        val s = st.nextToken()
        val sb = StringBuilder()
        for (c in s) {
            repeat(r) {
                sb.append(c)
            }
        }
        println(sb)
    }
}