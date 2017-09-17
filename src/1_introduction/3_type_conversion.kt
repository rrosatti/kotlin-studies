// https://www.programiz.com/kotlin-programming/type-conversion
package `1_introduction`

fun main(args: Array<String>) {
    val n1: Int = 10
    val n2: Long = n1.toLong()

    /** List of Functions used for type conversion */
    /**
     *
        toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toChar()
     *
     * */


    /** Conversion from larger to smaller type */
    val n3: Int = 545353
    val n4: Byte = n3.toByte()
    println("n3 (Int) = $n3")
    println("n4 (Byte) = $n4")

}
