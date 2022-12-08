fun main() {
    val message = "F2p)v\"y233{0->c}ttelciFc"
    val a = partTwo(message)
    println(a)
}

fun partOne(word: String): String {
    val firstHalf = word.take(word.length / 2)
    val stepOne = firstHalf.map {char -> char + 1}.joinToString("")
    val stepTwo = stepOne.replace("5", "s")
    val stepThree = stepTwo.replace("4", "u")
    val stepFour = stepThree.map {char -> char - 3}.joinToString("")
    val stepFive = stepFour.replace("0", "o")
    return (stepFive)
}
fun partTwo(word: String): String {
    val secondHalf = word.takeLast(word.length / 2)
    val stepOnePartTwo = secondHalf.reversed()
    val stepThreePartTwo = stepOnePartTwo.map {char -> char - 4}.joinToString("")
    val stepFourPartTwo = stepThreePartTwo.replace("_", " ")
    return (stepFourPartTwo)
}