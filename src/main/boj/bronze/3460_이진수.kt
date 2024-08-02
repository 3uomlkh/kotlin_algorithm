package bronze

fun main() {
    var t = readln().toInt()

    while (t-- > 0) {
        val sb = StringBuilder()
        val n = readln().toInt()
        val str = toBinary(n)
        for (i in str.indices) {
            if (str[i] == '1') sb.append(i).append(" ")
        }

        println(sb.toString())
    }
}

fun toBinary(n: Int) : String {
    var num = n
    val sb = StringBuilder()
    while (num > 0) {
        val rest = num % 2
        sb.append(rest)
        num /= 2
    }
    return sb.toString()
}