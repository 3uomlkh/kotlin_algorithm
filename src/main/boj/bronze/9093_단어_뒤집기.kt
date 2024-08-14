package bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var t = br.readLine().toInt()

    while (t-- > 0) {
        val st = StringTokenizer(br.readLine())
        val stack = Stack<Char>()
        val sb = StringBuilder()

        while (st.hasMoreTokens()) {
            val word = st.nextToken()
            for (c in word) stack.push(c)
            for (i in word.indices) sb.append(stack.pop())

            sb.append(" ")
        }

        println(sb.toString())
    }
}