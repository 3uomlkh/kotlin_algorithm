package silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val myBingo = Array(5) { IntArray(5) { 0 } }
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

//    val myBingo = Array(5) { IntArray(5) { 0 } }
//    val bingo = Array(5) { IntArray(5) { 0 } }

    for (i in myBingo.indices) {
        val st = StringTokenizer(br.readLine())
        for (j in myBingo[i].indices) {
            myBingo[i][j] = st.nextToken().toInt()
        }
    }

//    for (i in bingo.indices) {
//        val st = StringTokenizer(br.readLine())
//        for (j in bingo[i].indices) {
//            bingo[i][j] = st.nextToken().toInt()
//        }
//    }

    var count = 0
    var isBingo = false
    for (i in 0..4) {
        val st = StringTokenizer(br.readLine())
        for (j in 0..4) {
            if (getResultBingo(st.nextToken().toInt())) count++
        }
    }

    println(count)
}

fun getResultBingo(number: Int): Boolean {

    for (i in myBingo.indices) {
        for (j in myBingo[i].indices) {
            if (number == myBingo[i][j]) myBingo[i][j] = 0
        }
    }

    var bingoCount = 0

    // 가로
    for (i in myBingo.indices) {
        for (j in 0..4) {
            if (myBingo[i][j] != 0) break
            else if (myBingo[i][j] == 0) continue
            else if (myBingo[i][4] == 0) return true
        }
    }

    // 세로
    for (i in myBingo.indices) {
        for (j in 0..4) {
            if (myBingo[j][i] != 0) break
            else if (myBingo[j][i] == 0) continue
            else if (myBingo[4][i] == 0) return true
        }
    }

    // 오른쪽 대각선
    for (i in myBingo.indices) {
        for (j in 0..4) {
            if (i == j) {
                if (myBingo[i][j] != 0) break
                else if (myBingo[i][j] == 0) continue
                else if (myBingo[4][4] == 0) return true
            }
        }
    }

    // 왼쪽 대각선
    for (i in myBingo.indices) {
        if (myBingo[i][(myBingo.size - 1) - i] != 0) break
        else if (myBingo[i][(myBingo.size - 1) - i] == 0) continue
        else if (myBingo[4][0] == 0) return true
    }

    return false
}