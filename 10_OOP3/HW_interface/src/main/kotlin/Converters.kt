object Converters {

    private val convertersList = listOf(USDConverter(), EURconverter(), GBPconverter())

    fun get(currencyCode: String): CurrencyConverter {
        return convertersList.find { it.currencyCode == currencyCode.uppercase()} ?: object : CurrencyConverter {
            override val currencyCode = currencyCode.uppercase()
            override val currentCourse = 0.0
            override fun convertRub(simInRubles: Double) = println("Неизвестный код валюты.")

        }
    }
}

