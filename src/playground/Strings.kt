package playground
/*
* Strings
* https://play.kotlinlang.org/koans/Introduction/Strings/Task.kt
*/

fun main() {
    print("***KOAN: ${getPattern()}");
}

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
fun getPattern(): String = """\d{2}\ ${month} \d{4}"""
