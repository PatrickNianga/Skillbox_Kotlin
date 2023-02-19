class Fish(
    energy: Int, weight: Int,
    currentAge: Int, maxAge: Int,
    name: String
) : Animal(
    energy, weight,
    currentAge, maxAge,
    name
) {

    override fun move() {
        energy -= 5
        weight -= 1
        tryIncrementAge(curentAge)
        println(" $name плявет")
    }
}