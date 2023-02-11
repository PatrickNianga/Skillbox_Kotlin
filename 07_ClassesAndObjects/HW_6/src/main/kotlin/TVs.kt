

class TVs(val brand: String, val model: String, val diagonal: Int) {

    private var power = true
    fun powerON() {
        println("Телевизор включен.")
        power = true
    }

    fun powerOff() {
        println("Телевизор выключен.")
        power = false
    }

    var channelList = listOf(
        "ОРТ", "НТВ", "СТС", "РЕНтв",
        "ПЯТНИЦА", "РОССИЯ", "СПАС",
        "ДОМАШНИЙ", "ТНТ"
    )
    var currentChannel = 0

//    fun switchChannel(channel: Int) {
//        if (!power) {
//            powerON()
//            return switchChannel(channel)
//        } else if (!channelList.keys.contains(channel))
//            println("Выбранный канал еще не настроен.")
//        else {
//            currentChannel = channel
//            println("Выбран канал ${channelList[currentChannel]}")
//        }
//    }

    fun nextChannel() {
        currentChannel += 1
        if (currentChannel > channelList.lastIndex)
            currentChannel = 0
        println("${currentChannel} - ${channelList[currentChannel]}")

    }

    fun previousChannel() {
        currentChannel -= 1
        if (currentChannel < 0)
            currentChannel = channelList.lastIndex
        println("${currentChannel} - ${channelList[currentChannel]}")

    }


    companion object {
        var volumeMax = 100
    }

    private var currentVolume = 0

    fun volume(volume: Int) {
        currentVolume += volume
        if (currentVolume >= volumeMax)
            println("Задана максимальная громкость 100. Уменьшите звук")
        else if (currentVolume <= 0)
            println("Звуук отключен. Увеличьте громкость.")
        else
            println("Задана громкость $currentVolume")
    }
}














