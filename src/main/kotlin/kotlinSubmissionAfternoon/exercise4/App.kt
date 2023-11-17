package kotlinSubmissionAfternoon.exercise4

import java.lang.NullPointerException

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
class WrongPasswordException(message: String): Exception(message)

fun main() {
    try {
        print("Masukkan password : ")
        val name = readlnOrNull()

        if(name == "9090" ) {
            println("Welcome back admin!")
        }
        else {
            throw WrongPasswordException("Password yang dimasukkan tidak valid")
        }
    }
    catch (exception: NullPointerException) {
        println("Maaf data yang dimasukkan tidak valid")
    }
    catch (exception: WrongPasswordException) {
        println(exception.message)
    }
    finally {
        println("End")
    }
}
