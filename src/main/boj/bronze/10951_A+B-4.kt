package bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while (hasNextInt()) {
        println(nextInt() + nextInt())
    }
}