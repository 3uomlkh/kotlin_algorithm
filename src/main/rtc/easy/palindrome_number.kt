package easy

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
}

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    val sb = StringBuilder(str)
    val newStr = sb.reverse().toString()
    return str == newStr
}