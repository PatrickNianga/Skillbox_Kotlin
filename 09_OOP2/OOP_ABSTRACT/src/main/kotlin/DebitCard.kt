open class DebitCard(balance: Double) : BankCard(balance) {

    override fun topUpCard(cash: Double) {
        super.topUpCard(cash)
        if (cash > 0)
            balance += cash
        println("Карта пополнена на $cash")
    }

    override fun getInfoBalance() {
        println("Баланс карты $balance")
    }

}