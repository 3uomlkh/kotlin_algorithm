package lv_2

fun main() {
    val want = arrayOf("banana", "apple", "rice", "pork", "pot")
    val number = arrayOf(3, 2, 2, 2, 1)
    val discount = arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")

    println(solution(want, number, discount))
}

fun solution(want: Array<String>, number: Array<Int>, discount: Array<String>): Int {
    val stop = discount.size - 10
    val map = mutableMapOf<String, Int>()

    for (i in want.indices) {
        map[want[i]] = number[i]
    }

    var answer = 0
    for (start in discount.indices) {
        if (start > stop) break
        var isOK = true
        val arr = Array(want.size) { 0 }
        val end = start + 10
        for (i in start..<end) {
            if (map.containsKey(discount[i])) {
                val idx = want.indexOf(discount[i])
                arr[idx]++
            }
        }

        for (i in arr.indices) {
            if (arr[i] != number[i]) {
                isOK = false
            }
        }

        if (isOK) answer++
    }

    return answer
}