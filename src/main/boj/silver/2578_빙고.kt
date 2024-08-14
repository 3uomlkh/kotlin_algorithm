package silver

import java.io.*
import java.util.*

val myBingo = Array(5) { IntArray(5) { 0 } }
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    for (i in myBingo.indices) {
        val st = StringTokenizer(br.readLine())
        for (j in myBingo[i].indices) {
            myBingo[i][j] = st.nextToken().toInt()
        }
    }

    var count = 1
    for (i in 0..4) {
        val st = StringTokenizer(br.readLine())
        for (j in 0..4) {
            if (isBingo(st.nextToken().toInt())) {
                break
            } else {
                count++
            }
        }
    }

    println(count)
}

fun isBingo(number: Int): Boolean {

    for (i in myBingo.indices) {
        for (j in myBingo[i].indices) {
            if (number == myBingo[i][j]) myBingo[i][j] = 0
        }
    }

    var bingoCount = 0

    // 가로
    for (i in myBingo.indices) {
        if (myBingo[i].all { it == 0 }) bingoCount++
    }

    // 세로
    for (i in myBingo.indices) {
        if ((0..4).all { myBingo[it][i] == 0 }) bingoCount++
    }

    // 오른쪽 대각선
    if ((0..4).all { myBingo[it][it] == 0 }) bingoCount++

    // 왼쪽 대각선
    if ((0..4).all { myBingo[it][4 - it] == 0 }) bingoCount++

    return bingoCount >= 3
}