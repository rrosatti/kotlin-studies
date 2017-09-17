// https://www.programiz.com/kotlin-programming/while-loop
// https://www.programiz.com/kotlin-programming/for-loop
package `2_flow_control`

fun main(args: Array<String>) {
    /** Example simple while loop */
    var i = 1
    while (i <= 5) {
        println("i = $i")
        ++i
    }


    /** Example: Compute sum of Natural Numbers */
    var sum = 0
    var j = 100

    while (j != 0) {
        sum += j
        --j
    }
    println("Sum = $sum")


    /** Kotlin do...while loop */
    var sum2: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()
    } while (input != "0")
    println("sum2 = $sum2")


    /** FOR LOOP */

    /** Iterate through a range */
    for (z in 1..5) println("z = $z")


    /** Different ways to iterate Through a Range */
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    print("for (i in 1..4 step 2) print(i) = ")
    for (i in 1..4 step 2) print(i)
    println()

    print("for (i in 4 downTo 1 step 2) print(i) = ")
    for (i in 4 downTo 1 step 2) print(i)
    println()


    /** Iterating through an Array */
    var lang = arrayOf("Java", "Kotlin", "Python", "Ruby")
    for (l in lang) println(lang)


    /** Iterating through an Array with an index */
    for (l in lang.indices) {
        if (l%2 == 0)
            println(lang[l])
    }


    /** Iterating through a String */
    var name = "Rodrigo"
    for (letter in name) println(letter)

    /** Iterating through a String with an index */
    for (ind in name.indices) println(name[ind])



}
