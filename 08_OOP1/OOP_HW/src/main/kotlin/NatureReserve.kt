class NatureReserve {

    var zooList = mutableListOf<Animal>(
        Bird(name = "Орел", energy = 10, weight = 8, currentAge = 3, maxAge = 5),
        Bird(name = "Голубь", energy = 5, weight = 1, currentAge = 2, maxAge = 3),
        Bird(name = "Ворон", energy = 7, weight = 9, currentAge = 50, maxAge = 100),
        Bird(name = "Чайка", energy = 80, weight = 12, currentAge = 4, maxAge = 10),
        Bird(name = "Соловей", energy = 4, weight = 1, currentAge = 3, maxAge = 6),
        Fish(name = "Дельфин", energy = 20, weight = 30, currentAge = 4, maxAge = 23),
        Fish(name = "Клоун", energy = 12, weight = 1, currentAge = 1, maxAge = 2),
        Fish(name = "Акула", energy = 14, weight = 34, currentAge = 56, maxAge = 156),
        Dog(name = "Овчарка", energy = 10, weight = 22, currentAge = 6, maxAge = 19),
        Dog(name = "Спаниель", energy = 18, weight = 10, currentAge = 6, maxAge = 23),
        Horse(name = "Пони", energy = 25, weight = 100, currentAge = 13, maxAge = 35),
        Cat(name = "Котик", energy = 200, weight = 7, currentAge = 4, maxAge = 13),
        Animal(name = "Слон", energy = 1, weight = 300, curentAge = 20, maxAge = 85)
    )

    fun lifeAction() {
        var j = zooList.size
        for (i in 0..zooList.size) {
            when((1..5).random()) {
                1 -> zooList[i].move()
                2 -> zooList[i].sleep()
                3 -> zooList[i].eat()
                4 -> zooList.add(zooList[i].nextGen())
                5 -> {
                    if (zooList[i].isTooOld()) {
                        zooList.removeAt(i)
                        j = zooList.size
                    }
                }
            }
        }
        println("В заповеднике проживает $j животных")
    }
}