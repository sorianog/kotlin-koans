package playground.conventions

/*
* In range
* https://play.kotlinlang.org/koans/Conventions/In%20range/Task.kt
*/

fun main() {
    val date1 = MyDate(2020, 3, 10)
    val date2 = MyDate(2020, 4, 10)
    val date3 = MyDate(2020, 5, 10)
    print("Test 1: ${checkInRange(date2, date1, date3)}")
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(item: MyDate): Boolean = start <= item && item <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}