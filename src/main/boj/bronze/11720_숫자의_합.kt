package bronze

fun main() {
    val n = readln().toInt()
    val numbers = readln().toCharArray()
    var sum = 0
    for (c in numbers) {
        sum += Character.getNumericValue(c)
    }
    println(sum)
}