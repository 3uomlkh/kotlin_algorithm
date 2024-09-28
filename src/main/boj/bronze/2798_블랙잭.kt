package bronze

import java.util.StringTokenizer

fun main() {
    var st = StringTokenizer(readln())
    val n = st.nextToken().toInt() // 카드의 개수
    val m = st.nextToken().toInt() // 타켓 수

    st = StringTokenizer(readln())
    val numbers = IntArray(n)
    for (i in 0..<n) {
        numbers[i] = st.nextToken().toInt()
    }
    var max = 0
    for (i in numbers.indices) {
        for (j in numbers.indices) {
            if (i == j || i > m) continue
            for (k in numbers.indices) {
                if (j == k || i == k || i + j > m) continue
                val sum = numbers[i] + numbers[j] + numbers[k]
                if (sum in (max + 1)..m) {
                    max = sum
                }
            }
        }
    }
    println(max)
}