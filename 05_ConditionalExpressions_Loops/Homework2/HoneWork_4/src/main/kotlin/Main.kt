fun main() {
    fibonacciNumber()

}

fun fibonacciNumber() {
    println("Введите число ... !")
    val numberF: Int = readLine()?.toIntOrNull() ?: return
    if (numberF <= 0) {
        println("Вы ввели некорректное число, попробуйте снова.")
        return fibonacciNumber()
    }
    var numberF1 = 0
    var numberF2 = 1

    for (j in 2..numberF) {
        val numberResult = numberF1+numberF2
        numberF1 = numberF2
        numberF2 = numberResult
    }
    println("Число Фибоначчи с индексом $numberF равно $numberF2")

}



