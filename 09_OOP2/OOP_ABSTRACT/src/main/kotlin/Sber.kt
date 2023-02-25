class Sber(balance:Double):DebitCard(balance){

var savingBsonus = 0.0

    override fun topUpCard(cash: Double) {
        super.topUpCard(cash)
        savingBsonus += (cash/100)*0.005

    }

    override fun getInfoBalance() {
        super.getInfoBalance()
        println("Бонус за пополнение $savingBsonus")
    }

}

