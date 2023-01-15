import kotlin.random.Random
fun main() {

//    println("Введите число ... ")
//    val numberN = readLine()
//    val checkNumberN = {numberN:Int -> if (numberN <= 0 ) println("Введите число еще раз...") }


checkNumberN()

}
fun checkNumberN() {
    println("Введите число ... !")
    val numberN: Int = readLine()?.toIntOrNull() ?: return
    if (numberN <= 0) {
        println("Вы ввели некорректное число, попробуйте снова.")
        return checkNumberN()
    }
    val list = List(numberN){ Random.nextInt(-5, 5) }
    val mutableList = list.toMutableList()
    for (i in mutableList.indices) {
        if (i % 2 == 0)
            mutableList[i] = i * 10

    }
    println(mutableList)
    println(mutableList.sumOf { it })
    println(mutableList.filter { it > 0 })

}