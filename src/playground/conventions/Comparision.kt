package playground.conventions

/*
* Comparison
* https://play.kotlinlang.org/koans/Conventions/Comparison/Task.kt
 */

fun main() {
    val date1 = MyDate(2020, 4, 10)
    val date2 = MyDate(2020, 3, 10)
    println("Test 1: ${compare(date1, date2)}")
    println("Test 2: ${compare(date2, date1)}")
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) =
        when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2