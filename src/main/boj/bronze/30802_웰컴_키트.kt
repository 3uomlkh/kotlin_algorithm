package bronze

fun main() {
    val n = readln().toInt()
    val sizes = readln().split(" ").map { it.toInt() }
    val orders = readln().split(" ").map { it.toInt() }

    var tSum = 0
    for (size in sizes) {
        tSum += size / orders[0]
        if (size % orders[0] != 0) tSum++
    }

    println(tSum)
    println("${n / orders[1]} ${n % orders[1]}")
}