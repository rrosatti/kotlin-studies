// https://www.programiz.com/kotlin-programming/abstract-class

package iv_oop

/** Abstract Class and Method */
abstract class Person2(name: String) {
    init {
        println("I'm $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Person2(name) {
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val teacher1 = Teacher("John Smith")
    teacher1.displayJob("I'm a mathematics teacher.")
    teacher1.displaySSN(123456)
}