package silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    var n = st.nextToken().toInt() // 큐의 크기
    val m = st.nextToken().toInt() // 뽑아내려고 하는 수의 개수

    val dq = ArrayDeque<Int>(n)
    repeat(n) {
        dq.add(it + 1)
    }

    val num = IntArray(m)
    st = StringTokenizer(br.readLine())
    for (i in 0..<m) {
        num[i] = st.nextToken().toInt()
    }

    println( n - dq.indexOf(2))
    var min: Int
    var cnt = 0
    for (i in num) {
        if (dq.indexOf(i) >= n - dq.indexOf(i)) { // 오른쪽 이동
            min = n - dq.indexOf(i)
            for (j in 0..<min) {
                dq.addFirst(dq.removeLast())
            }
        } else { // 왼쪽 이동
            min = dq.indexOf(i)
            for (j in 0..<min) {
                dq.addLast(dq.removeFirst())
            }
        }
        dq.removeFirst()
        n--
        cnt += min
    }

    println(cnt)
}