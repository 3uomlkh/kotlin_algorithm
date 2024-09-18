package bronze

fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}