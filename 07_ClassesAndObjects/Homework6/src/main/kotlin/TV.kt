package Homework6.src.main.kotlin
import kotlin.random.Random

class TV(val brand:String, val model:String, val diagonal:Double) {
 private var tunrOnOff = true

fun turnOn () {
    println("Телевизор включен")
    tunrOnOff = true
}
fun turnOff(){
    println("Телевизор выключен")
    tunrOnOff = false
}
    val chanelList = listOf<String>("OPT", "СТС", "НТВ", "ТНТ", "РОССИЯ","ПЯТНИЦА")




}