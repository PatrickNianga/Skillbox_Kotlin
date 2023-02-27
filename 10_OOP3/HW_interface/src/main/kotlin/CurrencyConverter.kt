interface CurrencyConverter {

    val currencyCode:String
    val currentCourse:Double
    fun convertRub(simInRubles:Double)

}