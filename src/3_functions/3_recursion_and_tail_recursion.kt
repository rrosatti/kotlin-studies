// https://www.programiz.com/kotlin-programming
package `3_functions`

import java.math.BigInteger

fun main(args: Array<String>) {
    /** Example: Find factorial of a Number using Recursion */
    val num = 4
    val res: Long

    res = factorial(num)
    println("Factorial of $num is $res.")


    /** Tail Recursion */

    /**
     *
     *      What is Tail Recursion??
     *
     *
     * n tail recursion, calculations are performed first, then recursive calls
     * are executed (the recursive call passes the result of your current step
     * to the next recursive call). This makes the recursive call equivalent
     * to looping, and avoids the risk of stack overflow.
     *
     * */
    var n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println("Fibonacci: ${fibonacci(n, first, second)}")

    /** Example: Factorial Using Tail Recursion */
    n = 5
    println("Factorial of $n = ${tailRecFactorial(n)}")

}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n*factorial(n-1)
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}

tailrec fun tailRecFactorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else tailRecFactorial(n-1, run*n)
}