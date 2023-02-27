fun main() {
    println("Введите код валюты \nДоллар -USD\nЕвро - EUR \nБританский фунт - GBP")
    val currencyCode = readLine().toString()
    println("Введите сумму")
    val sumInRubles = readLine()!!.toDouble()
    Converters.get(currencyCode).convertRub(sumInRubles)



}