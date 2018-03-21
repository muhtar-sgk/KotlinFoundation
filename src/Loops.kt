fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett")
    for (imperial in imperials) {
        println("Name: $imperial")
    }

    val rebels = hashMapOf("Solo" to "Falcom", "Luke" to "Landspeeder")
    for ((key, value) in rebels) {
        println("$key gets around in their $value")
    }

    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}