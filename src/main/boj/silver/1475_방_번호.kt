package silver

fun main() {
    val n = readln().toCharArray()
    var arr = IntArray(10)
    var count = 1
    for (i in n.indices) {
        val num = Character.getNumericValue(n[i])
        if (arr[num] == 1) {
            if (num == 6 && arr[9] == 0) {
                arr[9] = 1
            } else if (num == 9 && arr[6] == 0) {
                arr[6] = 1
            } else if (arr[6] == 1 && arr[9] == 1) {
                count++
                arr = IntArray(10)
            }
            else {
                count++
            }
        } else {
            arr[num] = 1
        }
    }
    println(count)
}