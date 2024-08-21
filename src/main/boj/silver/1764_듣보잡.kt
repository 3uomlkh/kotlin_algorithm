package silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt() // 듣도 못한 사람의 수
    val m = st.nextToken().toInt() // 보도 못한 사람의 수

    val set1 = mutableSetOf<String>()
    repeat(n) {
        set1.add(br.readLine())
    }

    val set2 = mutableSetOf<String>()
    repeat(m) {
        set2.add(br.readLine())
    }

    val arr = ArrayList<String>()
    for (str in set1) {
        // 듣도 보도 못한 사람 구해 ArrayList에 추가하기(교집합)
        if (set2.contains(str)) arr.add(str)
    }

    // 사전 순으로 정렬
    val newArr = arr.sortedBy { it }
    val sb = StringBuilder()
    for (str in newArr) {
        sb.append(str).append("\n")
    }

    println("${arr.size}\n$sb")
}