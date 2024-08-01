package easy

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val map = HashMap<Char, Int>()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000

    var answer = 0
    for (i in s.indices) {
        if (map.containsKey(s[i])) {
            if (i - 1 >= 0 && s[i - 1] == 'I') {
                if (s[i] == 'V' || s[i] == 'X') {
                    answer--
                    answer += map[s[i]]!! - 1
                } else {
                    answer += map[s[i]]!!
                }
            } else if (i - 1 >= 0 && s[i - 1] == 'X') {
                if (s[i] == 'L' || s[i] == 'C') {
                    answer -= 10
                    answer += map[s[i]]!! - 10
                } else {
                    answer += map[s[i]]!!
                }
            } else if (i - 1 >= 0 && s[i - 1] == 'C') {
                if (s[i] == 'D' || s[i] == 'M') {
                    answer -= 100
                    answer += map[s[i]]!! - 100
                } else {
                    answer += map[s[i]]!!
                }
            } else {
                answer += map[s[i]]!!
            }
        }
    }

    return answer
}