package bronze

import java.lang.StringBuilder

fun main() {
    while (true) {
        val input = readln()
        if (input == "0") break

        val reverse = StringBuilder(input).reverse().toString()
        if (input == reverse) println("yes")
        else println("no")
    }
}