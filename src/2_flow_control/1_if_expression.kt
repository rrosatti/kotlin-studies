// https://www.programiz.com/kotlin-programming/if-expression
package `2_flow_control`

fun main(args: Array<String>) {

    /** Traditional use of if...else */
    var n1 = 1995
    if (n1 > 2000) {
        print("The number is greater than 2000")
    } else {
        print("The number is smaller than 2000")
    }


    /** Kotlin if expression */
    var age = 29

    var res = if (age < 18) {
        "You cannot get a driver license in Brazil yet. "
    } else {
        "Yup! You can get a driver licence in Brazil."
    }

    println(res)


    /** If block With Multiple Expressions */
    var a = 4
    var b = -3

    var max = if (a > b) {
        println("$a is larger than $b")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a")
        println("max variable holds value of b. ")
        b
    }
    println("max = $max")


    /** Kotlin if..else..if Ladder */
    var n2 = 0

    var res2 = if (n2 > 0)
        "positive number"
    else if (n2 < 0)
        "negative number"
    else
        "zero"

    println("n2 is $res2")


    /** Kotlin Nested if Expression */
    var num1 = 7
    var num2 = -13
    var num3 = 25

    var max2 = if (num1 > num2) {
        if (num1 > num3)
            num1
        else
            num3
    } else {
        if (num2 > num3)
            num2
        else
            num3
    }

    println("max2 = $max2")
}
