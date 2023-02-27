class GBPconverter:CurrencyConverter {

    override val currencyCode = "GBP"
    override val currentCourse = 90.69

    override fun convertRub(sumInRubles:Double) {
        sumInRubles / currentCourse
        println("$sumInRubles рублей = ${sumInRubles / currentCourse} $currencyCode")
    }
}