class Uralsib(balance:Double): CreditCard(balance) {

    var cashBack = 0.0

    override fun payment(pay: Double): Boolean {
        if (super.payment(pay)) {
            if (pay > 5000.0)
                cashBack+= pay*0.05
        }
        return true
    }

    override fun getInfoBalance() {
        super.getInfoBalance()
        println("Кэшбек за пукупки от 5000 - $cashBack")
    }
}