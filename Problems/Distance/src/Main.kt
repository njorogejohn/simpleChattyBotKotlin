import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (distance, timeSpent) = Array(2) { scanner.nextInt() }

    println(distance.toDouble().div(timeSpent))
}