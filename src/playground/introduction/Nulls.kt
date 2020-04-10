package playground.introduction

/*
* Nullable types
* https://play.kotlinlang.org/koans/Introduction/Nullable%20types/Task.kt
*/

fun main() {
    val mailer = TestMailer()
    sendMessageToClient(
        Client(
            null
        ), null, mailer
    )
    sendMessageToClient(
        Client(
            PersonalInfo("test@email.com")
        ), "Test message", mailer
    )
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) mailer.sendMessage(email, message);
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

class TestMailer : Mailer {
    override fun sendMessage(email: String, message: String) {
        print("Message sent!\nEmail: $email\nMessage: $message");
    }
}