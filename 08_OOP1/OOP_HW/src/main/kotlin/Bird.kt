class Bird(
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
        println(" $name летит")

    }

    override fun nextGen(): Bird {
        energy = (1..10).random()
        weight = (1..5).random()
        name
        maxAge
        curentAge = 0
        println("Родился: $name \nВес: $weight \nЭнергия: $energy ")
        return Bird(energy, weight, maxAge, name )
    }
}




