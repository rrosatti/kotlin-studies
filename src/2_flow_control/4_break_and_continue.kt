// https://www.programiz.com/kotlin-programming/break
// https://www.programiz.com/kotlin-programming/continue
package `2_flow_control`

fun main(args: Array<String>) {
    /** Example: break */
    for (i in 1..10) {
        if (i == 3) {
            break
        }
        println(i)
    }


    /** Example: Calculate sum until User enters 0 */
    var sum = 0
    var number: Int

    while (true) {
        print("Enter a number: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }
    println("sum = $sum")


    /** Kotlin labeled break */
    first@ for (i in 1..4) {
        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@first
        }
    }


    /** Example: Kotlin continue */
    for (i in 1..5) {
        println("$i always printed")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i not always printed")
    }


    /** Example: calculate sum of positive numbers only */
    var num: Int
    var sum2 = 0

    for (i in 1..6) {
        print("Enter an integer: ")
        num = readLine()!!.toInt()

        if (num <= 0)
            continue

        sum2 += num
    }
    println("sum = $sum2")


    /** Kotlin labeled continue */
    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }

}
