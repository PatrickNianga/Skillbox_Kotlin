class USDConverter : CurrencyConverter {

    override val currencyCode: String = "USD"
    override val currentCourse = 74.71

    override fun convertRub(sumInRubles:Double) {
        sumInRubles / currentCourse
        println("$sumInRubles рублей = ${sumInRubles / currentCourse} $currencyCode")
    }
}


