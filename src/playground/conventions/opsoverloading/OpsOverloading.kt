package playground.conventions.opsoverloading

import playground.conventions.opsoverloading.TimeInterval.*

/*
* Operators overloading
* https://play.kotlinlang.org/koans/Conventions/Operators%20overloading/Task.kt
 */

fun main() {
    val today = MyDate(2020, 4, 10)
    println("Test task1: ${task1(today)}")
    println("Test task2: ${task2(today)}")
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}