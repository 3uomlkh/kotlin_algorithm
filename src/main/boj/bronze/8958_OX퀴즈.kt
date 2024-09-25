package bronze

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val str = readln().split("")
        var score = if (str[0] == "O") 1 else 0
        var beforeScore = score
        for (i in 1..<str.size) {
            if (str[i] == "O") {
                beforeScore++
                score += beforeScore
            } else {
                beforeScore = 0
            }
        }
        println(score)
    }
}