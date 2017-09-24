// https://www.programiz.com/kotlin-programming/companion-objects

package iv_oop

/** Example: Companion Object */
class Person4 {
    companion object {
        fun call() = println("Hi, I was called from a companion object.")
    }
}

fun main(args: Array<String>) {
    // Now, it's possible to use call() without declare an object of Person4 class
    Person4.call()
}