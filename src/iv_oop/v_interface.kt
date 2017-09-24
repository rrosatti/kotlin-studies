// https://www.programiz.com/kotlin-programming/interfaces

package iv_oop

interface MyInterface {
    val test: Int

    fun foo() : String

    fun hello() {
        println("Hello!")
    }
}

class InterfaceImp : MyInterface {
    override val test: Int = 1995
    override fun foo() = "Wow, that's quite easy!"
}

/** Implementing Two or More Interfaces in a Class */
interface A {
    fun callA() {
        println("From interface A.")
    }
}

interface B {
    fun callB() {
        println("From interface B.")
    }
}

class Child: A, B

fun main(args: Array<String>) {
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())

    /** Implementing Two or More Interfaces in a Class **/
    val obj2 = Child()

    obj2.callA()
    obj2.callB()
}