// https://www.programiz.com/kotlin-programming/default-named-arguments
package iii_functions

fun main(args: Array<String>) {
    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('*',5)

    /** Kotlin named argument */
    println("\n\n Using named argument:")
    displayBorder(length = 10)
}

fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}
