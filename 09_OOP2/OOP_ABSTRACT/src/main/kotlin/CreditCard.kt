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
            var different = (creditLimit - creditMoney)
            ownMoney += cash - different
            creditMoney += different
        }

    }

    override fun payment(pay: Double): Boolean {
        if (ownMoney >= pay) {
            ownMoney -= pay
            println("Списанно $pay")
        } else if (ownMoney < pay) {
            creditMoney -= pay - ownMoney
            ownMoney -= ownMoney
            println("Списанно $pay")
            return true
        } else
            println("Недостаточно средств.")
        return false
    }


    override fun getInfoBalance() =
        println("Баланс карты равен ${balance} \nКредитных средств $creditMoney \nСобственные средства $ownMoney")
}

