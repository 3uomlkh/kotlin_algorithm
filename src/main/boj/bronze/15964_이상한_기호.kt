package bronze

import java.io.*
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()
    println("${(a + b) * (a - b)}")
}