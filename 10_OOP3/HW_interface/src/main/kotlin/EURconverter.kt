class EURconverter:CurrencyConverter {
    override val currencyCode: String = "EUR"
    override val currentCourse = 79.57

    override fun convertRub(sumInRubles:Double) {
        sumInRubles / currentCourse
        println("$sumInRubles рублей = ${sumInRubles / currentCourse} $currencyCode")
    }
}