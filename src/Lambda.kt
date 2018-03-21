fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}
    printMessage("Wow")

    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(5,3))

    fun downloadData (url: String, completion: () -> Unit) {
        completion()
    }
    downloadData("facebook.com", {
        println("wow completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        val car = Car("Tesla", "ModelX")
        completion(car)
    }
    downloadCarData("facebook.com") {
        println(it.make)
        println(it.model)
    }
    downloadCarData("facebook.com"){ car ->
        println(car.make)
        println(car.model)
    }
}