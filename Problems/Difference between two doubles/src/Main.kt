import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (number1, number2) = Array(2) { scanner.nextDouble() }

    println(number2 - number1)
}