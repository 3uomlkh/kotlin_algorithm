package bronze

fun main() {
    val n = readln().toInt()

    for (i in 0..<n) {
        for (j in (n - 1) - i downTo 1) {
            print(" ");
        }

        for (j in 0..i) {
            print("*");
        }
        println()
    }
}