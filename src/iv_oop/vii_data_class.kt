// https://www.programiz.com/kotlin-programming/data-class

package iv_oop

/** Example Data Class */
data class User(val name: String, val age: Int)

/**
 * When you declare a data class, the compiler automatically
 * generates several functions such as toString(), equals(),
 * hashcode() etc behind the scenes.
 * **/

fun main(args: Array<String>) {
    val user1 = User("Rodrigo", 22)
    println("Name: ${user1.name}")
    println("Age: ${user1.age}")


    /** Copying */
    val user2 = user1.copy(name = "John")

    println()
    println("user1: name = ${user1.name}, age = ${user1.age}")
    println("user2: name = ${user2.name}, age = ${user2.age}")


    /** toString() method */
    println()
    println(user1.toString())


    /** hashCode() and equals() */
    val user3 = user1.copy()
    val user4 = user1.copy(name = "Amanda")
    println()

    if (user1.equals(user3) == true)
        println("user1 is equal to user3.")
    else
        println("user1 is not equal to user3.")

    if (user1.equals(user4) == true)
        println("user1 is equal to user4.")
    else
        println("user1 is not equal to user4.")


    /** Destructuring Declarations */
    val user5 = User("Rosatti", 35)

    val (name, age) = user5
    println()
    println("name = $name")
    println("age = $age")


    /** ComponentN()  - just for curiosity */
    val user6 = User("Galvão", 90)

    println()
    println(user6.component1())
    println(user6.component2())

}