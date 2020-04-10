package playground.introduction
/*
* Named arguments
* https://play.kotlinlang.org/koans/Introduction/Named%20arguments/Task.kt
*/
fun main() {
    print("***KOAN: ${joinOptions(listOf("a", "b", "c"))}")
}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")