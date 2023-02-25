abstract class BankCard(var balance: Double) {

    open fun topUpCard(cash: Double) {}

    open fun payment(pay: Double): Boolean {
        return true
    }

    open fun getInfoBalance() {}
}

