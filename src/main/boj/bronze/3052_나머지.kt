package bronze

fun main() {
    val arr = ArrayList<Int>()
    repeat(10) {
        val n = readln().toInt() % 42
        if (!arr.contains(n)) arr.add(n)
    }
    println(arr.size)
}