package silver

fun main() {
    for (i in 1..10000) {
        if (isSelfNumber(i)) {
            println(i)
        }
    }
}

fun isSelfNumber(num: Int): Boolean {
    for (i in 1..num) {
        if (i < 10) {
            if (i + i == num) return false
        } else {
            var selfNum = i
            if (i < 100) {
                selfNum += (i / 10) + (i % 10)
            } else if (i < 1000) {
                selfNum += (i / 100) + ((i % 100) / 10) + ((i % 100) % 10)
            } else if (i < 10000) {
                selfNum += (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10)
            }
            if (selfNum == num) return false
        }
    }

    return true
}