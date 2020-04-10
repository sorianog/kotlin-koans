package playground.conventions.forloop

/*
* For loop
* https://play.kotlinlang.org/koans/Conventions/For%20loop/Task.kt
*/

fun main() {
    val date1 = MyDate(2020, 4, 10)
    val date2 = MyDate(2020, 4, 15)
    val dateRange = DateRange(date1, date2)
    val dateIterator = DateIterator(dateRange)
    iterateOverDateRange(date1, date2) { println("Test: ${dateIterator.hasNext()}") }
}

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> =
        DateIterator(this)
}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.end
}


fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

