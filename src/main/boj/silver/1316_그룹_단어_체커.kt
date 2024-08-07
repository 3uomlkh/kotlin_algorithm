package silver

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    var result = 0

    while (n-- > 0) {
        val word = br.readLine()
        val arr = Array(word.length) { ' ' }
        var idx = 0
        var isGroup = true

        for (i in word.indices) {
            if (!arr.contains(word[i])) {
                arr[idx++] = word[i]
            } else {
                if (i - 1 >= 0 && word[i - 1] != word[i]) {
                    isGroup = false
                    break
                }
                arr[idx++] = word[i]
            }
        }

        if (isGroup) result++
    }

    println(result)
}