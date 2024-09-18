package bronze

fun main() {
    val str = readln()
    val sb = StringBuilder()
    for (c in str) {
        if (c.isUpperCase()) {
            sb.append(Character.toLowerCase(c))
        } else {
            sb.append(Character.toUpperCase(c))
        }
    }
    println(sb)
}