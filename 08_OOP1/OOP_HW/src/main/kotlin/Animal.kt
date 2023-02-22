import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, var curentAge: Int, var maxAge: Int, var name: String) {

    fun isTooOld(): Boolean {
        curentAge >= maxAge
        return true
    }

    open fun sleep() {
        energy += 5
        curentAge += 1
        println("$name спит")
    }

    open fun eat() {
        energy += 3
        weight += 1
        tryIncrementAge(curentAge)
        println("$name ест")
    }

    open fun move() {
        energy -= 5
        weight -= 1
        tryIncrementAge(curentAge)
        println("$name двигается")
    }

    fun tryIncrementAge(curenrAge: Int): Int {
        if (Random.nextBoolean())
            curenrAge + 1
        return curenrAge
    }

    open fun nextGen(): Animal {
        energy = (1..10).random()
        weight = (1..5).random()
        maxAge
        name
        curentAge = 0
        println("Родился: $name \nВес: $weight \nЭнергия: $energy ")
        return Animal(energy, weight, maxAge, curentAge, name)


    }
}
