fun main() {
    val samsung = TVs(brand = "Samsung", model = "s30", diagonal = 30)
    val sony = TVs(brand = "Sony", model = "s50", diagonal = 50)
    val bbq = TVs(brand = "BBQ", model = "b60", diagonal = 60)
    printInfo(samsung)
    printInfo(sony)
    printInfo(bbq)


}

fun printInfo (tVs: TVs) {
    println("Brand - ${tVs.brand}, Model - ${tVs.model}, Diagonal - ${tVs.diagonal}")
    println("Список каналов ${tVs.brand} - ${tVs.channelList}")
    tVs.powerON()
    tVs.volume(50)
    tVs.channelList
    tVs.powerOff()
    tVs.switchChannel(3)
    tVs.nextChannel()
    tVs.previousChannel()


}