fun main() {

    val sber = DebitCard(5000.0)
    val vtb = CreditCard(balance = 3000.0)
    val savingBonusCard = Sber(balance = 1000.0)
    val bonusPointsCard = VTB(balance = 1000.0)
    val cashBackCard = Uralsib(balance = 5000.0)

    sber.topUpCard(1000.0)
    sber.getInfoBalance()
    println()

    vtb.payment(3000.0)
    vtb.topUpCard(3000.0)
    vtb.getInfoBalance()
    println()

    bonusPointsCard.payment(1000.0)
    bonusPointsCard.getInfoBalance()
    println()

    savingBonusCard.topUpCard(1000.0)
    savingBonusCard.getInfoBalance()
    println()

    cashBackCard.payment(6000.0)
    cashBackCard.getInfoBalance()


}