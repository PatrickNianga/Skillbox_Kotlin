fun main() {

    val firstName = "Patrik"
    val lastName = "Nianga Elenga"

    var height = 1.85
    var weight = 100f

    var isChild = height < 1.5 || weight < 40
    println("Возжно вы ребенок? - $isChild" + "\n")

    var info = """
        Мои:
        Имя - $firstName
        Фамилия - $lastName
        Рост - $height м.
        Вес - $weight кг.
        Ребенок ли я? - $isChild
    """.trimIndent()

    println(info + "\n")

    height = 1.65
    weight = 39F
    isChild = height < 1.5 || weight < 40

    info = """
        Мои:
        Имя - $firstName
        Фамилия - $lastName
        Рост - $height м.
        Вес - $weight кг.
        Ребенок ли я? - $isChild
    """.trimIndent()

    println(info)


//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}