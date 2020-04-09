package playground

/*
* Extension functions
* https://play.kotlinlang.org/koans/Introduction/Extension%20functions/Task.kt
*/

fun main() {
    val numInt = 1
    println("Int.r() Test: ${numInt.r() is RationalNumber}")

    val pair = Pair(1, 2)
    println("Pair.r() Test: ${pair.r() is RationalNumber}")
}

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)