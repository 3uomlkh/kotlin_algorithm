package bronze

fun main() {
    val n = readln().toInt()
    var result = 0
    for (i in 1..<n) {
        var number = i
        var sum = 0
        while (number != 0) {
            sum += number % 10
            number /= 10
        }
        if (sum + i == n) {
            result = i
            break
        }
    }
    println(result)
}