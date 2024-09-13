package bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    var sum = 0L
    repeat(st.countTokens()) {
        sum += st.nextToken().toLong() // A, B, C의 범위가 1 이상 10의 12승 이하이므로 toInt()가 아닌 toLong()을 사용한다.
    }
    println(sum)
}