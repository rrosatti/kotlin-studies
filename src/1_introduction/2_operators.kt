// https://www.programiz.com/kotlin-programming/operators
package `1_introduction`

fun main(args: Array<String>) {
    var n1 = 12.5
    var n2 = 3.5
    var result: Double

    result = n1 + n2
    println("$n1 + $n2 = $result")

    result = n1 - n2
    println("$n1 - $n2 = $result")

    result = n1 / n2
    println("$n1 / $n2 = $result")

    result = n1 * n2
    println("$n1 * $n2 = $result")

    result = n1 % n2
    println("$n1 % $n2 = $result")

    concatString()
}

fun concatString() {
    var name = "Rodrigo"
    var middleName = "Rosatti"
    var lastName = "Galvão"
    var fullName: String

    fullName = name + " " + middleName + " " + lastName
    println("Full Name: $fullName")
}

/** Assignment Operators */
fun assignOperator() {
    var n = 12
    n *= 5
    println("Assignment Operator: $n")
}

/** Unary Operators */
fun unaryOperators() {
    val a = 1
    val b = true
    var c = 1

    var res: Int
    var booleanRes: Boolean

    res = -a
    println("-a = $res")

    booleanRes = !b
    println("!b = $booleanRes")

    --c
    println("--c = $c")
}

/** Logical Operators */
fun logicalOperators() {
    val a = 10
    val b = 8
    val c = -2
    var res: Boolean

    res = (a>b) && (a>c)
    println("Res (a>b) && (a>c) = $res")
}

/** IN operator */
fun inOperator() {
    val nums = intArrayOf(2, 4, 6, 8, 10)

    if (6 in nums) {
        println("6 is in nums array!")
    }
}

/** Index Access Operator */
/**
 *  Expression               Translated to
        a[i]	                a.get(i)
        a[i, n]	                a.get(i, n)
    a[i1, i2, ..., in]	        a.get(i1, i2, ..., in)
        a[i] = b	            a.set(i, b)
        a[i, n] = b	            a.set(i, n, b)
    a[i1, i2, ..., in] = b	    a.set(i1, i2, ..., in, b)
 *
 * */
fun indexAcessOperator() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    println("a[2] = $a[2]")
    a[1] = 25
    println("a[1] = $a[1]")
}