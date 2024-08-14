package silver

import java.io.*
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val money = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val stockPrice = IntArray(14)
    for (i in stockPrice.indices) {
        stockPrice[i] = st.nextToken().toInt()
    }

    val bnp = bnp(money, stockPrice)
    val timing = timing(money, stockPrice)

    if (bnp > timing) {
        println("BNP")
    } else if (bnp < timing) {
        println("TIMING")
    } else {
        println("SAMESAME")
    }
}

fun bnp(currentMoney: Int, stockPrice: IntArray) : Int {
    var money = currentMoney
    var sharesHeld = 0
    val lastPrice = stockPrice[stockPrice.size - 1]
    for (price in stockPrice) {
        if (money >= price) { // full 매수
            while (money >= price) {
                money -= price
                sharesHeld++
            }
        }
//        println("주가: $price, 남은 현금: $money, 보유 주식 수: $sharesHeld")
    }
    return money + (lastPrice * sharesHeld)
}

fun timing(currentMoney: Int, stockPrice: IntArray) : Int {
    var money = currentMoney
    var sharesHeld = 0
    val lastPrice = stockPrice[stockPrice.size - 1]

    for (i in 3 until stockPrice.size) {
        val today = stockPrice[i]
        val oneDaysBefore = stockPrice[i - 1] // 1일 전 주가
        val twoDaysBefore = stockPrice[i - 2] // 2일 전 주가
        val threeDaysBefore = stockPrice[i - 3] // 3일 전 주가

        if (twoDaysBefore > threeDaysBefore && oneDaysBefore > twoDaysBefore) { // 3일 연속 상승 -> 전량 매도
            money += today * sharesHeld
            sharesHeld = 0
        } else if (twoDaysBefore < threeDaysBefore && oneDaysBefore < twoDaysBefore) { // 3일 연속 하락 -> 전량 매수
            sharesHeld += money / today
            money %= today
        }

//        println("1일 전 주가: $oneDaysBefore, 2일 전 주가: $twoDaysBefore, 3일 전 주가: $threeDaysBefore")
//        println("-----------------------------------------------------------------------------")
//        println("주가: $today, 남은 현금: $money, 보유 주식 수: $sharesHeld")
    }
    return money + (lastPrice * sharesHeld)
}