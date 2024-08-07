package bronze

import java.io.*
import java.util.StringTokenizer

fun main() {
    /* readln() -> BufferedReader() 로 변경,
     * split() -> StringTokenizer() 로 변경 후 시간과 메모리 모두 줄었다.
     * 입력의 크기가 작지 않은 한 BufferedReader + StringTokenizer 를 사용하자!
     */

    val br = BufferedReader(InputStreamReader(System.`in`))
    var t = br.readLine().toInt()

    while (t-- > 0) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val arr = Array(n) { 0 }
        for (i in 0..<n) {
            arr[i] = st.nextToken().toInt()
        }

        var min = Integer.MAX_VALUE
        var max = Integer.MIN_VALUE
        for (i in arr.indices) {
            if (arr[i] < min) {
                min = arr[i]
            }
            if (arr[i] > max) {
                max = arr[i]
            }
        }

        println("$min $max")
    }
}