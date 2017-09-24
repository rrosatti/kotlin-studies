// https://www.programiz.com/kotlin-programming/inner-nested-class

package iv_oop

/** Example Nested Class */
class Outer {
    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

/** Example Inner Class */
class Outer2 {
    val a = "Outside Nested class."
    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested Class
    println(Outer.Nested().b)

    // creating object of Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())

    /** Example Inner Class */
    val outer = Outer2()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer2().Inner()
    println("Using inner object: ${inner.callMe()}")
}
