fun main(args: Array<String>) {
    fun testFun() {
        println("Test")
    }
    testFun()

    fun login(username: String, password: String) {
        println(username)
        println(password)
    }
    login("muhtar", "muhtarganteng")

    fun calculate(a: Int, b: Int): Int {
        val c = a + b
        return c
    }
    val amount = calculate(10,20)
    println(amount)
}