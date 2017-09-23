// https://www.programiz.com/kotlin-programming/inheritance

package iv_oop


/**
 * By default, classes in Kotlin are final.
 * By using the open annotation on a class,
 * compiler allows you to derive new classes from it.
 */
open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("I'm $age years old.")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {
    fun teachMaths() {
        println("I teach in primary school")
    }
}

class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for São Paulo Football Club")
    }
}

/** ----------- Other example ----------- */
open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> + $_data", 10) {

    }
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {

    }
}

/** ---- Overriding Member Function ---- */
open class Product() {
    open fun showProductName(productName: String) {
        println("This is a $productName")
    }
}

class Computer: Product() {
    override fun showProductName(productName: String) {
        println("Nope, I'm product: $productName")
    }
}

/**
 *
 * Example: Kotlin Inheritance
 *
 */
fun main(args: Array<String>) {
    val t1 = MathTeacher(28, "Mary")
    t1.teachMaths()

    println()

    val f1 = Footballer(32, "John")
    f1.playFootball()

    /** --- Second Example --- */
    val log1 = AuthLog("Bad Password")

    /** --- Third Example --- */
    val prod1 = Product()
    prod1.showProductName("Brand new computer")
}

