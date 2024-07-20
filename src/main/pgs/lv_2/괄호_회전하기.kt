package lv_2

import java.util.*

fun main() {
    println(solution("[](){}"))
    println(solution("}]()[{"))
    println(solution("[)(]"))
    println(solution("}}}"))
}

fun solution(s: String): Int {
    var answer = 0
    var str = s

    for (i in 0..<s.length) {
        if (isProper(str)) answer++
        val c = str[0]
        str = str.substring(1, str.length) + c
    }

    return answer
}

fun isProper(str: String): Boolean {
    val stack = Stack<Char>()
    var isStackEmpty = false
    for (i in str.indices) {
        if (stack.isEmpty()) {
            stack.push(str[i])
        } else {
            if (stack.peek() == '[' && str[i] == ']') {
                stack.pop()
            } else if (stack.peek() == '(' && str[i] == ')') {
                stack.pop()
            } else if (stack.peek() == '{' && str[i] == '}') {
                stack.pop()
            } else {
                stack.push(str[i])
            }
        }
    }

    if (stack.isEmpty()) isStackEmpty = true

    return isStackEmpty
}