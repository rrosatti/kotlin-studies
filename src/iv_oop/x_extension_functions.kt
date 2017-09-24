// https://www.programiz.com/kotlin-programming/extension-functions

package iv_oop

/**
 *
 * Basically, an extension function is a member function of
 * a class that is defined outside the class.
 *
 * */

/** Example: Remove First and Last Character of String */
fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val name = "xRodrigox"
    val res = name.removeFirstLastChar()
    println("Before: $name | After: $res")
}