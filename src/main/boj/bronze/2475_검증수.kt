package bronze

import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    var sum = 0
    repeat(st.countTokens()) {
        val num = st.nextToken().toInt()
        sum += num * num
    }
    println(sum % 10)
}