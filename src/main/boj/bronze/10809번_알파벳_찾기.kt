package bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val alphabet = Array(26) { -1 }

    for (i in input.indices) {
        val idx = input[i].code - 97
        if (alphabet[idx] == -1) alphabet[idx] = i
    }

    for (i in alphabet) {
        print("$i ")
    }
}