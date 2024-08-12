package silver

fun main() {
    val check = BooleanArray(10001)
    for (i in 1..10000) {
        var num = i
        var sum = i
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        if (sum < 10001) {
            check[sum] = true
        }
    }

    for (i in 1..10000) {
        if (!check[i]) println(i)
    }
}