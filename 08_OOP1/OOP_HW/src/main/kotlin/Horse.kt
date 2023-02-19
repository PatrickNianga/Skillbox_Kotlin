class Horse(
    energy: Int, weight: Int,
    currentAge: Int, maxAge: Int,
    name: String
) : Animal(
    energy, weight,
    currentAge, maxAge,
    name
) {
    override fun sleep() {
        energy += 10
        curentAge += 1
        println("$name спит")
    }

    override fun eat() {
        energy += 23
        weight += 5
        tryIncrementAge(curentAge)
        println("$name ест")
    }

    override fun move() {
        energy -= 20
        weight -= 8
        tryIncrementAge(curentAge)
        println("$name скачет")
    }
}