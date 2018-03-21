fun main(args: Array<String>) {
    val a = 2
    val b = 2
    if (a == b) {
        println("equal")
    }
    if (a != b) {
        println("not equal")
    }

    val accountBalance = 100
    val price = 50
    if (accountBalance >= price) {
        println("Buy!")
    } else {
        println("Broke!")
    }

    val degress = 70
    if (degress >= 70) {
        println("Nice")
    } else if (degress < 70 && degress >= 50) {
        println("Grab sweater")
    } else {
        println("Cold")
    }

    val isHungry = false
    val isBored = true
    if (isHungry || isBored) {
        println("Eat Pizza")
    }

    val x = 3
    when(x) {
        1 -> println("1")
        2 -> println("2")
        else -> println("not 1 or 2")
    }

    fun yourFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("bad mood")
        } else {
            println("good mood")
        }
    }
    yourFeeling()


}