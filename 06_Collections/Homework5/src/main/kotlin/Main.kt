import kotlin.random.Random
fun main() {

//    println("Введите число ... ")
//    val numberN = readLine()
//    val checkNumberN = {numberN:Int -> if (numberN <= 0 ) println("Введите число еще раз...") }

    checkNumberN()
    userRegistration()


}

fun checkNumberN() {
    println("Введите число ... !")
    val numberN: Int = readLine()?.toIntOrNull() ?: return
    if (numberN <= 0) {
        println("Вы ввели некорректное число, попробуйте снова.")
        return checkNumberN()
    }
    val list = List(numberN){ Random.nextInt(-5, 5) }
    val mutableList = list.toMutableList()
    for (i in mutableList.indices) {
        if (i % 2 == 0)
            mutableList[i] = i * 10

    }
    println(mutableList)
    println(mutableList.sumOf { it })
    println(mutableList.filter { it > 0 })

}

fun userRegistration() {
    println("Введите количество регистрируемых пользователей:")
    val userScore = readLine()?.toIntOrNull() ?: return
    val usersTable = hashMapOf<String, String>()
    for (i in 1..userScore) {
        println("Введите имя пользователя ${i}:")
        var userName = readLine()
        while (userName.isNullOrEmpty()) {
            println("Вы не ввели имя пользователя! Попробуйте снова:")
            userName = readLine()
        }

        println("Придумайте пароль для пользователя ${userName}: ")
        var userPasword = readLine()
        while (userPasword.isNullOrEmpty()) {
            println("Вы не ввели пароль! Попробуйте снова:")
            userPasword = readLine()
        }
        usersTable.put("${userName}", "${userPasword}")
    }

        println("Количество зарегистрированных пользователей ${userScore}")
        println("Список зарегистрированных пользователей ${usersTable}")

        println("Введите логин:")
        val login = readLine()
        val userlogin = usersTable.keys.contains(login)
        while (!userlogin) {
            println("Такого пользователя не существует. Введите логин еще раз:")
            val login = readLine()
            val userlogin = usersTable.keys.contains(login)
            if (userlogin) break
        }
            println("введите пароль для :")
            val pasword = readLine()
            if (usersTable[login] != pasword)
                println("Указан неверный логин или пароль».")
            else
                    println("Добро пожаловать ${login}")

    }









