// https://www.programiz.com/kotlin-programming/functions
// https://www.programiz.com/kotlin-programming/infix-notation
package iii_functions

fun main(args: Array<String>) {
    println("Before callMe()")
    callMe()

    var n1: Double
    var n2: Double
    var sum: Int

    print("Enter a number: ");
    n1 = readLine()!!.toDouble()

    print("Enter another number: ")
    n2 = readLine()!!.toDouble()

    sum = addNumbers(n1, n2)
    println("result = $sum")


    /** Infix Function call */

    /** Example: kotlin or & and function */
    var a = true
    var b = false
    var result: Boolean

    result = a or b // a.or(b)
    println("result = $result")

    result = a and b // a.and(b)
    println("result = $result")


    /** Example: User-defined Function with infix notation */
    val structure = Structure()
    structure createPyramid 4
}

fun callMe() {
    println("I'm callMe() function!")
}

fun addNumbers(n1: Double,n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

class Structure() {
    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}