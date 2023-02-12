import kotlin.random.Random
import kotlin.random.nextInt

object Channels {

    var channelList = listOf( "ОРТ", "НТВ", "СТС", "РЕНтв", "ПЯТНИЦА", "РОССИЯ", "СПАС", "ДОМАШНИЙ", "ТНТ", "MTv")

    fun addChannel(): MutableList<String> {
        val randomChannelList = channelList.take(Random.nextInt(3..channelList.size)).toMutableList()
        randomChannelList.shuffled()
        return randomChannelList
    }

}