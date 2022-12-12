fun main() {
    fibonacciNumberForLoop()
    fibonacciNumberWhileLoop()

}

fun fibonacciNumberForLoop() {
    println("Введите число ... !")
    val numberF: Int = readLine()?.toIntOrNull() ?: return
    if (numberF <= 0) {
        println("Вы ввели некорректное число, попробуйте снова.")
        return fibonacciNumberForLoop()
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

fun fibonacciNumberWhileLoop() {
    println("Введите число ... !")
    var numberF: Int = readLine()?.toIntOrNull() ?: return
    if (numberF <= 0) {
        println("Вы ввели некорректное число, попробуйте снова.")
        return fibonacciNumberWhileLoop()
    }
    var numberF1 = 0
    var numberF2 = 1
    var i = numberF - 1

    while (i>0 ) {
        val numberResult = numberF1+numberF2
        numberF1 = numberF2
        numberF2 = numberResult
        i -= 1
    }
    println("Номер элемента ряда Фибоначчи: $numberF \nЗначение этого элемента равно: $numberF2")

}



