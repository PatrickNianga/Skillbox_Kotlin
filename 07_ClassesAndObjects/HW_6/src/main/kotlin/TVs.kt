class TVs(val brand: String, val model: String, val diagonal: Int) {

    var power = false
        private set

    fun powerON() {
        println("Телевизор включен.")
        power = true
    }

    fun powerOff() {
        println("Телевизор выключен.")
        power = false
    }

    var channelList = Channels.addChannel()

    var currentChannel = 0

    fun switchChannel(channel: Int) {
        if (!power)
            powerON()
        println( channelList.getOrElse(channel) { println("Выбранный канал не настроен в данном телевизоре") })
        currentChannel = channel
    }

    fun nextChannel() {
        if (!power)
            powerON()
        currentChannel += 1
        if (currentChannel > channelList.lastIndex)
            currentChannel = 0
        println("${currentChannel} - ${channelList[currentChannel]}")

    }

    fun previousChannel() {
        if (!power)
            powerON()
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
            println("Задана максимальная громкость 100.")
        else if (currentVolume <= 0)
            println("Звуук отключен.")
        else
            println("Задана громкость $currentVolume")
    }
}














