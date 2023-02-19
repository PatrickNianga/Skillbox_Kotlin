import kotlin.random.Random

class Cat(
    energy: Int, weight: Int,
    currentAge: Int, maxAge: Int,
    name: String
) : Animal(
    energy, weight,
    currentAge, maxAge,
    name
) {

    override fun sleep() {
        energy += 30
        curentAge += 1
        println("$name спит")
    }

    override fun eat() {
        energy += 12
        weight += 7
        tryIncrementAge(curentAge)
        println("$name ест")
    }

    override fun move() {
        energy -= 50
        weight -= 1
        tryIncrementAge(curentAge)
        println("$name играется")
    }


}