class VTB(balance: Double) : CreditCard(balance) {

    private var bonusPoints = 0.0
    override fun payment(pay: Double): Boolean {
        if (super.payment(pay))
            bonusPoints += pay * 0.01
        return true
    }

    override fun getInfoBalance() {
        super.getInfoBalance()
        println("Бонус за покупки $bonusPoints")
    }
}

