fun main() {
    fibonacciNumber()

}

fun fibonacciNumber() {
    println("Введите число ... !")
    val numberF: Int = readLine()?.toIntOrNull() ?: return
    if (numberF <= 0) {
        println("Вы ввели некорректное число, поробуйте снова.")
        return fibonacciNumber()
    }

}



