// https://www.programiz.com/kotlin-programming/constructors
fun main(args: Array<String>) {
    /**
    In Kotlin, there are two constructors:

    Primary constructor - concise way to initialize a class
    Secondary constructor - allows you to put additional initialization logic
    
     */
    
    val per1 = Person("Rodrigo", 22)
    println("First name: ${per1.firstName}")
    println("Age: ${per1.age}")

    val per2 = Person2("Rodrigo", 22)
}

/** Example: Primary Constructor */
class Person(val firstName: String, var age: Int) {

}

/** Example: Primary Constructor with initializer block */
class Person2(_firstName: String, _age: Int) {
    //val firstName: String
    //val age: Int
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        //firstName = fName.capitalize()
        //age = personAge

        println("First name: $firstName")
        println("Age: $age")
    }
}    
