package playground.conventions

/*
* Invoke
* https://play.kotlinlang.org/koans/Conventions/Invoke/Task.kt
*/
fun main() {
    val invokable = Invokable()
    invokeTwice(invokable)
    print("Test invokeTwice(): ${invokable.numberOfInvocations}")
}

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()