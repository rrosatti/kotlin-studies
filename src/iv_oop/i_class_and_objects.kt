// https://www.programiz.com/kotlin-programming/class-objects
package iv_oop

fun main(args: Array<String>) {
    val l1 = Lamp()
    val l2 = Lamp()

    l1.turnOff()
    l2.turnOn()

    l1.displayLampStatus("l1")
    l2.displayLampStatus("l2")
}

class Lamp {
    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLampStatus(lamp: String) {
        if (isOn == true)
            println("$lamp lamp is on")
        else
            println("$lamp lamp is off")
    }
}

