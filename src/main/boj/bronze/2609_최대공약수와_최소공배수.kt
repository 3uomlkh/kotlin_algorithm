package bronze

import java.util.StringTokenizer

// 최대공약수 & 최대공약수 -> 유클리드 호제법 기억하기!!
fun main() {
    val st = StringTokenizer(readln())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    // 최대공약수(GCD)
    val gcd = gcd(a, b)
    // 최소공배수(LCM)
    val lcm = (a * b) / gcd

    println(gcd)
    println(lcm)
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a