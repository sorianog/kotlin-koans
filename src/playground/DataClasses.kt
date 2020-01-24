package playground
/*
* Data classes
* https://play.kotlinlang.org/koans/Introduction/Data%20classes/Task.kt
*/

fun main() {
    print("***KOAN: ${getPeople()}")
}

data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
