open class CreditCard(
    balance: Double,
) :
    BankCard(balance) {

    private var creditLimit = balance
    private var creditMoney = 4000.0
    private var ownMoney = 2000.0

    override fun topUpCard(cash: Double) {
        super.topUpCard(cash)
        if (creditMoney >= balance) {
            ownMoney += cash
        } else {
            val different = (creditLimit - creditMoney)
            ownMoney += cash - different
            creditMoney += different
        }
        println("Карта пополнена на $cash")
    }

    override fun payment(pay: Double): Boolean {
        return if (creditMoney + ownMoney - pay >= 0) {
            if (ownMoney > pay)
                ownMoney -= pay
            else
                creditMoney -= pay - ownMoney
            ownMoney -= ownMoney
            println("Списанно $pay")
            true
        } else {
            println("Недостаточно средств")
            false
        }

    }


    override fun getInfoBalance() {
        println("Баланс карты равен ${balance} \nКредитных средств $creditMoney \nСобственные средства $ownMoney")
    }
}

