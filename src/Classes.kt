open class Car (val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vromm")
    }

    fun detail() {
        println("name: $make, model: $model")
    }
}

class Cars(make: String, model: String) : Car(make, model) {
    override fun accelerate() {
        super.accelerate()
        println("wow")
    }
}

fun main(args: Array<String>) {
    val car = Car("Toyota", "Soluna")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.detail()

    val cars = Cars("Honda", "Brio")
    println(cars.make)
    println(cars.model)
    cars.accelerate()
}