package easy

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    strs.sortByDescending{ it.length }
    var shortestStr = strs[0]

    shortestStr.forEachIndexed { i, c ->
        if (strs.any { it[i] != c }) return shortestStr.substring(0, i)
    }

    return shortestStr
}