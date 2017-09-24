// https://www.programiz.com/kotlin-programming/operator-overloading

package iv_oop

/** Example: Overloading + Operator */
class Point(val x: Int = 0, val y: Int = 10) {
    // overloading plus function
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
}

/** Example: Overloading -- Operator */
class Point2(var x: Int = 0, var y: Int = 0) {
    operator fun dec() = Point2(--x, --y)
}

fun main(args: Array<String>) {
    val p1 = Point(5, 25)
    val p2 = Point(15, 75)

    var sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")

    /** Overloading -- operator */
    var p3 = Point2(8, 27)
    --p3

    println("point = (${p3.x}, ${p3.y})")

}
