fun main() {
    // Исходное зашифрованное сообщение
    val encryptedMessage = "F2p)v\"y233{0->c}ttelciFc"
    println("Исходное зашифрованное сообщение: $encryptedMessage")
    // Половина зашифрованного сообщения
    val halfChar = encryptedMessage.length / 2
    // Расшифровка первой половины сообщения
    val decryptedMessageFirstPart = decryptionFirstPart(encryptedMessage.take(halfChar))
    val decryptedMessageSecondPart = decryptionSecondPart(encryptedMessage.takeLast(halfChar))
    println("Расшифрованное сообщение: ${decryptedMessageFirstPart + decryptedMessageSecondPart}")
}

/**
 * Расшифровка первой половины сообщения
 * @param sourceString - исходное сообщение
 */
fun decryptionFirstPart(sourceString: String): String {
    println("--- Запуск расшифровки первой части сообщения: $sourceString")
    var resultString = shift(sourceString) {
        right(sourceString, 1)
    }
    resultString = replaceChars(resultString, "5", "s")
    resultString = replaceChars(resultString, "4", "u")
    resultString = shift(resultString) {
        left(resultString, 3)
    }
    resultString = replaceChars(resultString, "0", "o")
    return resultString
}

/**
 * Расшифровка второй половины сообщения
 * @param sourceString - исходное сообщение
 */
fun decryptionSecondPart(sourceString: String): String {
    println("--- Запуск расшифровки второй части сообщения: $sourceString")
    var resultString = sourceString.reversed()
    println("------ Сообщение после реверса: $resultString")
    resultString = shift(resultString) {
        left(resultString, 4)
    }
    resultString = replaceChars(resultString, "_", " ")
    return resultString
}

/**
 * Сдвиг всех символов в строке
 * @param sourceString - сообщение
 * @param shiftAction - параметр функционального типа
 */
fun shift(sourceString: String, shiftAction: (String) -> String): String {
    return shiftAction(sourceString)
}

/**
 * Сдвиг каждого символа влево
 * @param sourceString - исходное сообщение
 * @param shiftTo - кол-во сдвигов
 * @return String
 */
fun left(sourceString: String, shiftTo: Int): String {
    println("------ Сдвиг каждого символа влево на $shiftTo")
    val resultString = sourceString.map { it - shiftTo }.joinToString("")
    println("------ Сообщение после замены символов сдвигом: $resultString")
    return resultString
}

/**
 * Сдвиг каждого символа вправо
 * @param sourceString - сообщение
 * @param shiftTo - кол-во сдвигов
 * @return String
 */
fun right(sourceString: String, shiftTo: Int): String {
    println("------ Сдвиг каждого символа вправо на $shiftTo")
    val resultString = sourceString.map { it + shiftTo }.joinToString("")
    println("------ Сообщение после замены символов сдвигом: $resultString")
    return resultString
}


/**
 * Замена символов
 * @param sourceString - сообщение
 * @param oldChar - что заменяется
 * @param newChar - на что заменяется
 * @param ignoreCase - игнор регистра символов
 */
fun replaceChars(sourceString: String, oldChar: String, newChar: String, ignoreCase: Boolean = false): String {
    println("------ Замена $oldChar на $newChar")
    val resultString = sourceString.replace(oldChar, newChar, ignoreCase)
    println("------ Сообщение после замены: $resultString")
    return resultString
}