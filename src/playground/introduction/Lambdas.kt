package playground.introduction
/*
* Lambdas
* https://play.kotlinlang.org/koans/Introduction/Lambdas/Task.kt
*/

fun main () {
    println("***KOAN: ${containsEven(listOf(0, 2, 3))}")
    println("***KOAN: ${containsEven(listOf(-1, 1, 3))}")
}

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }