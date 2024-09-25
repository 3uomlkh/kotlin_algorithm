package bronze

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val str = (a * b * c).toString()
    val arr = Array(10) { 0 }
    for (c in str) {
        val idx = Character.getNumericValue(c)
        arr[idx]++
    }
    for (i in arr) {
        println(i)
    }
}