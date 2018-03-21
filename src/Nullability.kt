fun main(args: Array<String>) {
    var nullableName: String? = "Do I really exist?"
    nullableName = null

    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)
}