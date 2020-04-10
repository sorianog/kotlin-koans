package playground.introduction

import java.util.*

/*
* SAM conversions
* https://play.kotlinlang.org/koans/Introduction/SAM%20conversions/Task.kt
*/

fun main() {
    print("ArrayList Contents: ")
    getListSAM().forEach { print("$it ") }
}

fun getListSAM(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    // Java Collections static method call should be replaced with Kotlin stdlib
    // Can be simplified to:
    // arrayList.sortWith(Comparator { x, y -> y - x })
    return arrayList
}