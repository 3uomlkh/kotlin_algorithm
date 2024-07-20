package lv_2
fun main() {
    println(solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)))
    println(solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)))
    println(solution(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)))
}

fun solution(k: Int, tangerine: IntArray): Int {
    val map = HashMap<Int, Int>()
    for (t in tangerine) {
        map[t] = map.getOrDefault(t, 0) + 1
    }

    val list = arrayListOf<Int>()
    for ((key, value) in map) {
        list.add(value)
    }

    val newList = list.sortedDescending()
    var sum = 0
    var count = 0
    for (i in newList.indices) {
        sum += newList[i]
        count++
        if (sum >= k) break
    }

    return count
}