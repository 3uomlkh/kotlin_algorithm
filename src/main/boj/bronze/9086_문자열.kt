package bronze

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val str = readln()
        sb.append(str[0]).append(str[str.length - 1]).append("\n")
    }
    println(sb)
}