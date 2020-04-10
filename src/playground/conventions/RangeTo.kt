package playground.conventions

/*
* Range to
* https://play.kotlinlang.org/koans/Conventions/Range%20to/Task.kt
*/

fun main() {
    val date1 = MyDate(2020, 3, 10)
    val date2 = MyDate(2020, 4, 10)
    val date3 = MyDate(2020, 5, 10)
    print("Test 1: ${checkInRange2(date2, date1, date3)}")
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange2(this, other)

class DateRange2(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange2(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}