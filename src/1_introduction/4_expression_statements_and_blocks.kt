// https://www.programiz.com/kotlin-programming/statement-expression
package `1_introduction`

fun main(args: Array<String>) {
    /** Kotlin Expressions */
    var a = 50
    var b = 64
    var max: Int

    max = if (a > b) a else b
    println("The highest value is $max.")

    /** Kotlin Statements */
    // Statements are everything that make up a complete unit of execution
    var score = 50 + 87
    println("Rodrigo")
    var i = 0;
    ++i

    /** Kotlin Blocks */
    // A block is a group of statements (zero or more) that is enclosed in curly braces { }

    var flag = true
    if (flag) {
        println("The flag is set as $flag")
    }
}
