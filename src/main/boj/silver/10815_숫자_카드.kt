package silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var st = StringTokenizer(br.readLine())
    val myCard = HashMap<Int, Int>()
    for (i in 0..<n) {
        myCard[st.nextToken().toInt()] = 0
    }

    val m = br.readLine().toInt()
    st = StringTokenizer(br.readLine())
    val numbers = IntArray(m)
    for (i in numbers.indices) {
        numbers[i] = st.nextToken().toInt()
    }

    val sb = StringBuilder()
    for (num in numbers) {
        if (myCard.containsKey(num)) {
            sb.append(1).append(" ")
        } else {
            sb.append(0).append(" ")
        }
    }

    println(sb.toString())
}