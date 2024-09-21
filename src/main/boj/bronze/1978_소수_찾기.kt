package bronze

import java.math.*
import kotlin.math.sqrt

fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    var count = 0
    for (num in numbers) {
        if (isPrime(num)) count++
    }
    println(count)
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..<sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}