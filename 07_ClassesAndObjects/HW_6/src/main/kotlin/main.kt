
import kotlin.random.Random
fun main() {
    val samsung = TVs(brand = "Samsung", model = "s30", diagonal = 30)
    samsung.powerOff()
    samsung.volume(50)
    //samsung.switchChannel(10)
    samsung.nextChannel()
    samsung.previousChannel()



    printInfo(samsung)

}

fun printInfo(tVs: TVs) {
    println("Brand - ${tVs.brand}, Model - ${tVs.model}, Diagonal - ${tVs.diagonal}")
}