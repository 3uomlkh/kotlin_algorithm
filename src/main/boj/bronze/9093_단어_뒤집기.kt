package bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val st = StringTokenizer(br.readLine())
        repeat(st.countTokens()) {
            sb.append(st.nextToken().reversed()).append(" ")
        }
        sb.appendLine()
    }

    print(sb.toString())
}