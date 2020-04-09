package playground

/*
* Extension functions on collections
* https://play.kotlinlang.org/koans/Introduction/Extensions%20on%20collections/Task.kt
*/

fun main() {
    print("ArrayList Contents: ")
    getListDesc().forEach { print("$it ") }
}

fun getListDesc(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}