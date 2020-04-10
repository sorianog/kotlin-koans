package playground.introduction

/*
* Smart casts
* https://play.kotlinlang.org/koans/Introduction/Smart%20casts/Task.kt
*/

fun main() {
    println("Test Num: ${eval(
        Num(
            1
        )
    )}")
    println("Test Sum: ${eval(
        Sum(
            Num(1),
            Num(1)
        )
    )}")
}

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(
            expr.right
        )
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) :
    Expr