import kotlin.random.Random

class Animal(val energy: Int, val weight: Int, val curenrAge: Int, val maxAge: Int, val name: String) {

    fun isTooOld(curenrAge: Int, maxAge: Int): Boolean {
        curenrAge >= maxAge
        return true
    }

    fun sleep() {
        energy += 5
        curenrAge += 1
        println("$name спит")
    }

    fun eat() {
        energy += 3
        weight += 1
        curenrAge += 1
        println(" $name ест")
    }

    fun move() {
        energy -= 5
        weight -= 1
        curenrAge += 1
        println(" $name двигается")
    }

    fun tryIncrementAge() {
        curenrAge = random.nextBolean()
    }

}
