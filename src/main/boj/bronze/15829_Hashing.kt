package bronze

fun main() {
    val l = readln().toInt()
    val str = readln()

    val m = 1234567891
    val r = 31
    var hashValue = 0L // 해시 값을 저장하는 변수
    var power = 1L // 31^i 값을 저장하는 변수

    for (i in str.indices) {
        val charvalue = (str[i].code - 'a'.code + 1) // 문자에 대응하는 숫자 구하기
        hashValue = (hashValue + (charvalue * power) % m) % m // 해시 값 계산
        power = (power * 31) % m // 31의 거듭제곱 구하기
    }
    println(hashValue)
}