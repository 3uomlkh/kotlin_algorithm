package silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt() // 방바닥의 세로 크기
    val m = st.nextToken().toInt() // 방바닥의 가로 크기

    val floor = Array(n){ Array(m) {' '} }

    for (i in 0..<n) {
        val arr = br.readLine().toCharArray()
        for (j in 0..<m) {
            floor[i][j] = arr[j]
        }
    }

    // '-' 바닥 장식 개수
    var check = 0
    var count = 0
    for (i in floor.indices) {
        for (j in floor[i].indices){
            if (floor[i][j] == '-') {
                if (check == 0) {
                    check = 1
                    count++
                }
            } else {
                check = 0
            }
        }
        check = 0
    }

    // '|' 바닥 장식 개수
    val sum = count
    check = 0
    count = 0
    for (i in 0..<m) {
        for (j in 0..<n) {
            if (floor[j][i] == '|') {
                if (check == 0) {
                    check = 1
                    count++
                }
            } else {
                check = 0
            }
        }
        check = 0
    }

    println(sum + count)

}