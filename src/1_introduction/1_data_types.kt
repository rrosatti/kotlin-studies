// https://www.programiz.com/kotlin-programming/variable-types
package `1_introduction`

fun main(args: Array<String>) {
    // either var or val can be used to declare a variable
    var language = "Portuguese"
    val year = 1995

    // you can also explicitly specify the variable type
    var language2: String = "English"
    val year2: Int = 2000

    // Examples that result in Error
    //var language3
    //language3 = "Chinese"

    //var language4: String
    //language4 = 100



    /** Differences between VAR and VAL */
    // val: immutable reference. The variable declared with val cannot be changed once the value is assigned.
    // var: mutable reference. The variable declared with var can be changed later in the program.



    /** Kotlin Basic Types */

    /** Number Type */

    // 1. Byte (Have values from -128 to 127)
    val range: Byte = 112
    println("range: $range\n")

    // 2. Short (Values from -32768 to 32767)
    val temperature: Short = -11245
    println("temperature: $temperature\n")

    // 3. Int (Values from -2^31 to 2^(31)-1 )
    val score: Int = 10000
    println("score: $score\n")

    // 4. Long (Values -2^63 to 2^(63)-1 )
    val highestScore: Long = 9999
    println("highest score: $highestScore\n")
    val distance = 100L // distance variable of type Long

    // 5. Double (Values 64-bit floating point)
    val distance2 = 999.5
    println("(Double) distance: $distance2\n")

    // 6. Float (Values 32-bit floating point)
    val distance3 = 19.5F
    println("(Float) distance: $distance3\n")


    /** Char */

    val letter: Char
    letter = 'r'
    println("letter: $letter\n")


    /** Boolean */

    val flag = true
    println("flag: $flag\n")


    /** Array */

    var array = arrayOf(2,4,6,8)
    for (num in array) {
        println("$num")
    }
    println()


    /** String */

    var name = "Rodrigo Rosatti Galvão"
    println("name: $name\n")

}

