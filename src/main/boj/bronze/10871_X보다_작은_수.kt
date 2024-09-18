package bronze

import java.io.*
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt() // 수열 A의 크기
    val x = st.nextToken().toInt() // x보다 작은 수를 구해야 함.

    st = StringTokenizer(br.readLine())
    val arr = arrayOfNulls<Int>(n)
    for (i in 0..<n) {
        arr[i] = st.nextToken().toInt()
    }

    for (i in arr) {
        if (i != null) {
            if (i < x) bw.write("$i ")
        }
    }

    bw.flush()
    bw.close()
}

// 더 짧은 버전
//fun main() {
//    val condition = readln().split(" ").map { it.toInt() }
//    val list = readln().split(" ").map { it.toInt() }
//    println(list.filter { it < condition[1] }.joinToString(" "))
//}