// https://www.programiz.com/kotlin-programming/input-output
package `1_introduction`

import java.util.*

fun main(args: Array<String>) {
    /** Print String Entered By the User*/
    print("Enter your first name: ")

    val firstName = readLine()!!
    println("Thank you a lot, Mr. $firstName")


    /** Getting Integer Input from the User */
    val reader = Scanner(System.`in`)
    print("Enter your age: ")

    var age: Int = reader.nextInt()
    println("You are $age years old.")

    /*
    * To get Long, Float, double and Boolean input from the user, you can use nextLong(),
    * nextFloat(), nextDouble() and nextBoolean() methods respectively.
    * */

}
