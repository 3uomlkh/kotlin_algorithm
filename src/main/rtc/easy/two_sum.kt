package easy

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var answer = IntArray(2) { 0 }
    for (i in nums.indices) {
        for (j in i + 1..<nums.size) {
            val sum = nums[i] + nums[j]
            if (sum == target) {
                answer = intArrayOf(i, j)
            }
        }
    }
    return answer
}