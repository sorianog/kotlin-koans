package playground

import java.util.*

/*
* Object expressions
* https://play.kotlinlang.org/koans/Introduction/Object%20expressions/Task.kt
*/

fun main() {
    print("ArrayList Contents: ")
    getList().forEach { print("$it ") }
}

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList,
                     object : Comparator<Int> { override fun compare(x: Int, y: Int) = y - x }
                    )
    return arrayList
}