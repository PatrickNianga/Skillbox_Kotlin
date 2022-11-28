fun main() {

    val firstName = "Patrik"
    val lastName = "Nianga Elenga"

    var height = 1.85
    var weight = 100F

    var isChild = height < 1.5 || weight < 40
    println("Возжно вы ребенок? - $isChild")

    var info = """
        $firstName
        $lastName
        $height
        $weight
        $isChild
    """.trimIndent()

    println(info)

    height = 1.6

    info = """
        $firstName
        $lastName
        $height
        $weight
        $isChild
    """.trimIndent()

    println(info)









//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}