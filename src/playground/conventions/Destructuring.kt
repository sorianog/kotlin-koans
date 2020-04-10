package playground.conventions

/*
* Destructuring declarations
* https://play.kotlinlang.org/koans/Conventions/Destructuring%20declarations/Task.kt
*/

fun main() {
    val date1 = MyDate2(2020, 4, 10)
    println("Test 1: ${isLeapDay(date1)}")

    val date2 = MyDate2(2020, 2, 29)
    println("Test 2: ${isLeapDay(date2)}")
}


data class MyDate2(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate2): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}