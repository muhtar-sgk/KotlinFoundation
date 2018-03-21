fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett")
    println(imperials.sorted())
    println(imperials[1])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)
    println(imperials.size)
    println(imperials.indexOf("Emperor"))

    val imperials2 = arrayListOf("Emperor", "Darth Vader", "Boba Fett")
    imperials2.add("Luke")
    println(imperials2)
    imperials2.remove("Emperor")
    println(imperials2)

    val rebel = mapOf("Solo" to "Falcom", "Luke" to "Landspeeder")
    println(rebel["Solo"])
    println(rebel.get("Solo"))
    println(rebel.getOrDefault("Leiah", "Ship doesn't exist"))
    println(rebel.keys)
    println(rebel.values)

    val rebel2 = hashMapOf("Solo" to "Falcom", "Luke" to "Landspeeder")
    rebel2["Luke"] = "XWing"
    rebel2.put("Leiah", "Tantive IV")
    println(rebel2)
    rebel2.remove("Solo")
    println(rebel2)
    rebel2.isEmpty()






}