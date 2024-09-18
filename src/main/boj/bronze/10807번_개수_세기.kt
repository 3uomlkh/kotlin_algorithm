package bronze

fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()
    val search = list.filter { it == v }
    println(search.size)
}