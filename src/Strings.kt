fun main(args: Array<String>) {
    val str = "Dragon Ball Super"
    println(str)

    for (char in str) {
        println(char)
    }

    val upperCase = str.toUpperCase()
    val lowerCase = str.toLowerCase()
    val subSeq = str.subSequence(1,5)
    println(upperCase)
    println(lowerCase)
    println(subSeq)

    println("my name is $str")
}