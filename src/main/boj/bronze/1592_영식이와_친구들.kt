package bronze

import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt() // 자리 개수
    val m = st.nextToken().toInt() // 받은 공의 최대 개수
    val l = st.nextToken().toInt() // 공을 던질 자리

    val arr = IntArray(n + 1)
    var catch = 1
    while (!arr.contains(m)) {
        arr[catch]++
        if (arr[catch] % 2 != 0) { // 현재 공을 받은 횟수가 홀수번
            catch = (catch + l) % n
        } else { // 현재 공을 받은 횟수가 짝수번
            if (catch - l <= 0) {
                catch = ((catch - l) + n) % n
            } else {
                catch -= l
            }
        }
    }
    var sum = 0
    arr.forEach { sum += it }
    println(sum - 1)
}