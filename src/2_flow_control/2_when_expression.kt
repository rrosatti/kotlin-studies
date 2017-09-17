// https://www.programiz.com/kotlin-programming/when-expression
package `2_flow_control`

fun main(args: Array<String>) {

    // The when construct in Kotlin can be thought of as a replacement for Java switch Statement.

    /** Simple when Expression */
    var a = 5
    var b = 45

    println("Enter an operator either +, - * or /")
    var operator = readLine()

    var res = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }
    println("res = $res")


    /** Same thing as above, but without being an expression */
    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid.")
    }


    /** Few possibilities */

    /** 1. Combine two or more branch conditions with a comma */
    var n = -1

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4")
        0 -> println("n is zero")
        -1, -2 -> println("n is a positive integer greater than -3")
    }

    /** 2. Check value in the range. */
    var c = 100

    when(c) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100")
    }

    /** 3. Check if a value is of a particular type. */
    /**

    when(x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }*/

    /** 4. Use expressions as branch condition */
    var n1 = 11
    var n2 = "11"

    when (n2) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close, but not close enough")
        a.toString() -> println("Bingo! It's eleven.")
    }
}
