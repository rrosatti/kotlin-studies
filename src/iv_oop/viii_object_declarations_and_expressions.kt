// https://www.programiz.com/kotlin-programming/object-singleton

package iv_oop

/** Example: Object Declaration */
object Test {
    private var a: Int = 0
    var b: Int = 1

    fun doSomething(): Int {
        return a + b
    }
}

/** Example: Kotlin Object Expression */
/**
 *
 * The object keyword can also be used to create objects
 * of an anonymous class known as anonymous objects.
 * They are used if you need to create an object of a slight
 * modification of some class or interface without declaring
 * a subclass for it.
 *
 */
open class Person3(name: String, age: Int) {

    init {
        println("I'm $name and I am $age years old.")
    }

    fun eat() = println("I'm eating.")
    fun talk() = println("I'm talking.")
    open fun pray() = println("Praying god.")
}

fun main(args: Array<String>) {
    val res: Int

    res = Test.doSomething()

    println("b = ${Test.b}")
    println("result = $res")

    /** Example: Kotlin Object Expression */
    println()
    val atheist = object : Person3("Rodrigo", 22) {
        override fun pray() = println("I don't pray. I am an atheist.")
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()
}
